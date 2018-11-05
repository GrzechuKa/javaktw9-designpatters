package pl.sdacademy.designpattterns.duck;

import pl.sdacademy.designpattterns.duck.strategy.flying.Flying;
import pl.sdacademy.designpattterns.duck.strategy.flying.WingedFlying;
import pl.sdacademy.designpattterns.duck.strategy.quacking.Quacking;
import pl.sdacademy.designpattterns.duck.strategy.quacking.StandardQuacking;
import pl.sdacademy.designpattterns.duck.strategy.swimming.StandardSwimming;
import pl.sdacademy.designpattterns.duck.strategy.swimming.Swimming;

import java.util.Random;

public class AliveDuck implements Duck {


    private String duckName;
    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;
    private DuckCoop duckCoop;

    private Integer totalEgg;

    public AliveDuck(String duckName, Quacking quackingStrategy, Flying flyingStrategy, Swimming swimmingStrategy) {
        this.duckName = duckName;
        this.quackingStrategy = quackingStrategy;
        this.flyingStrategy = flyingStrategy;
        this.swimmingStrategy = swimmingStrategy;
        totalEgg = 0;
    }

    @Override
    public void quack() {
        quackingStrategy.quacking();
    }

    @Override
    public void swim() {
        swimmingStrategy.swimming();
    }

    @Override
    public void fly() {
        flyingStrategy.fly();
    }

    @Override
    public Integer totalEggsLaid() {
        return totalEgg;
    }

    @Override
    public Integer age() {
        return new Random().nextInt(1000) + 10;
    }

    @Override
    public DuckEgg layEgg() {
        //stworzyć jajo
        //poinformowac kacznik o jaju
        //zlozyc jajo
        DuckEgg.Bilder eggBuilder = new DuckEgg.Bilder();
        eggBuilder.setYolkWeight(26D);
        DuckEgg egg = eggBuilder.build();
        totalEgg++;
        duckCoop.notifyAboutEgg(egg);
        return egg;
    }

    @Override
    public void walkTODuckCoop(DuckCoop duckCoop) {
        duckCoop.register(this);
        this.duckCoop = duckCoop;
    }

    @Override
    public void notify(DuckEgg egg) {
        //wyswietlic pochawale
//        System.out.println("Hurra new Egg");
        System.out.println(duckName + ":Gret egg!");
    }





}
