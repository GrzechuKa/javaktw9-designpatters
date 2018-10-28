package pl.sdacademy.designpattterns.duck;

import pl.sdacademy.designpattterns.duck.strategy.flying.FallingNotFlying;
import pl.sdacademy.designpattterns.duck.strategy.flying.Flying;
import pl.sdacademy.designpattterns.duck.strategy.flying.WingedFlying;
import pl.sdacademy.designpattterns.duck.strategy.quacking.Quacking;
import pl.sdacademy.designpattterns.duck.strategy.quacking.SqueakNotQuacking;
import pl.sdacademy.designpattterns.duck.strategy.quacking.StandardQuacking;
import pl.sdacademy.designpattterns.duck.strategy.swimming.FloatingNotSwinmming;
import pl.sdacademy.designpattterns.duck.strategy.swimming.StandardSwimming;
import pl.sdacademy.designpattterns.duck.strategy.swimming.Swimming;

import java.util.Random;

public class RubberDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;
    private DuckCoop duckCoop;

    public RubberDuck() {
        quackingStrategy = new SqueakNotQuacking();
        flyingStrategy = new FallingNotFlying();
        swimmingStrategy = new FloatingNotSwinmming();
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
        return 0;
    }

    @Override
    public Integer age() {
        return new Random().nextInt(10000) + 10;
    }

    @Override
    public DuckEgg layEgg() {
        return null;
    }

    @Override
    public void walkTODuckCoop(DuckCoop duckCoop) {
        System.out.println("Noop");
    }

    @Override
    public void notify(DuckEgg egg) {
        //wyswietlic pochawale
//        System.out.println("Hurra new Egg");
        String duckType = getClass().getSimpleName();
        System.out.println(duckType + "Piii");
    }
}
