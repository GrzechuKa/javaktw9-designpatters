package pl.sdacademy.designpattterns.duck.strategy.quacking;

public class SqueakNotQuacking implements Quacking{
    @Override
    public void quacking() {
        System.out.println("Squeak!");
    }
}
