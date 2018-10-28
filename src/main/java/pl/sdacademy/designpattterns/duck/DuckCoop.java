package pl.sdacademy.designpattterns.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckCoop {

    private List<Duck> duckList;

    public DuckCoop(){
        duckList = new ArrayList<>();
    }

    public void register(Duck duck){
        duckList.add(duck);
    }

    public void unregister(Duck duck){
        duckList.remove(duck);
    }

    public void notifyAboutEgg(DuckEgg egg){
//        for (Duck duck : duckList) {
//            duck.notify(egg);
//        }
        duckList.forEach(duck -> duck.notify(egg));
    }
}
