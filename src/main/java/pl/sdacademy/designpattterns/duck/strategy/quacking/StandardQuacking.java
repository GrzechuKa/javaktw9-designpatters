package pl.sdacademy.designpattterns.duck.strategy.quacking;

public class StandardQuacking implements Quacking {
    @Override
    public void quacking() {
        System.out.println("Quack!");
    }
}
