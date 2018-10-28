package pl.sdacademy.designpattterns.duck.strategy.flying;

public class WingedFlying implements Flying {
    @Override
    public void fly() {
        System.out.println("I'm using wings and flying");
    }
}
