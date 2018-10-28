package pl.sdacademy.designpattterns.duck;

import pl.sdacademy.designpattterns.duck.singleton.FarmerEagerSingleton;
import pl.sdacademy.designpattterns.duck.strategy.Fodder;

public class DuckMain {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck greenWingedTealDuck = new GreenWingedTealDuck();

        mallardDuck.quack();
        mallardDuck.fly();
        mallardDuck.swim();

        rubberDuck.quack();
        rubberDuck.fly();
        rubberDuck.swim();

        greenWingedTealDuck.quack();
        greenWingedTealDuck.fly();
        greenWingedTealDuck.swim();

        DuckEgg.Bilder bilder = new DuckEgg.Bilder();
        bilder.setYolkWeight(28D);
        DuckEgg egg = bilder.build();
        System.out.println(egg);

        Fodder.Builder fodderBuilder = Fodder.builder(500, 500);
        Fodder fodder = fodderBuilder
                .minerals(true)
                .triticalGrams(222)
                .build();

        FarmerEagerSingleton farmer = FarmerEagerSingleton.getInstance();
        farmer.askVet();
        System.out.println("=========");
        farmer.askVet();
    }

}
