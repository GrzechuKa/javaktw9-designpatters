package pl.sdacademy.designpattterns.duck.strategy.swimming;

public class FloatingNotSwinmming implements Swimming {


    @Override
    public void swimming() {
        System.out.println("I'm drifts");
    }
}
