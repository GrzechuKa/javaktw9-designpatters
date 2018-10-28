package pl.sdacademy.designpattterns.duck.strategy.flying;

public class FallingNotFlying implements Flying {
    @Override
    public void fly() {
        System.out.println("I'm falling down");
    }
}
