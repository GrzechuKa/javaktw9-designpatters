package pl.sdacademy.designpattterns.duck.strategy.swimming;

public class StandardSwimming implements Swimming {

    @Override
    public void swimming() {
        System.out.println("I'm using fins and swimming");
    }
}
