package pl.sdacademy.designpattterns.duck;

import java.util.Comparator;
import java.util.List;

public class DucksStatistics {

    private List<Duck> ducks;

    public DucksStatistics(List<Duck> ducks) {
        this.ducks = ducks;
    }

//    public Integer getOldestDuckAge() {
//        Integer oldestDuckAge = Integer.MIN_VALUE;
//        for (Duck duck : ducks) {
//            Integer duckAge = duck.age();
//            if(duckAge > oldestDuckAge){
//                oldestDuckAge = duckAge;
//            }
//        }
//        return oldestDuckAge;
//    }

    public Integer getOldestDuckAge() {
    return ducks.stream()
            .sorted(Comparator.comparing(Duck::age).reversed())
            .findFirst()
            .map(Duck::age)
            .orElse(Integer.MIN_VALUE);
    }
}
