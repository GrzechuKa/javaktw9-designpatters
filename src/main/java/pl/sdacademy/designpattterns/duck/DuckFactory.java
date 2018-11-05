package pl.sdacademy.designpattterns.duck;

import pl.sdacademy.designpattterns.duck.strategy.flying.WingedFlying;
import pl.sdacademy.designpattterns.duck.strategy.quacking.StandardQuacking;
import pl.sdacademy.designpattterns.duck.strategy.swimming.StandardSwimming;

public class DuckFactory {
    public Duck createDuck(DuckType type){
        switch (type) {
            case MALLARD_DUCK:
                return new AliveDuck("Mallard Duck", new StandardQuacking(), new WingedFlying(), new StandardSwimming());
            case GREENWINGEDTEALDUCK:
                return new AliveDuck("Green Winged Teal Duck", new StandardQuacking(), new WingedFlying(), new StandardSwimming());
            case RUBBERDUCK:
                return new RubberDuck();
            default:
                throw new IllegalArgumentException("Unknow duck : " + type);
        }
    }
}