package pl.sdacademy.designpattterns.duck;

import pl.sdacademy.designpattterns.duck.strategy.flying.Flying;
import pl.sdacademy.designpattterns.duck.strategy.flying.WingedFlying;
import pl.sdacademy.designpattterns.duck.strategy.quacking.Quacking;
import pl.sdacademy.designpattterns.duck.strategy.quacking.StandardQuacking;
import pl.sdacademy.designpattterns.duck.strategy.swimming.StandardSwimming;
import pl.sdacademy.designpattterns.duck.strategy.swimming.Swimming;

import java.util.Random;

public class MallardDuck implements Duck{

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public MallardDuck() {
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new StandardSwimming();
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
        return new Random().nextInt(100);
    }

    @Override
    public Integer age() {
        return new Random().nextInt(1000) + 10;
    }
}
