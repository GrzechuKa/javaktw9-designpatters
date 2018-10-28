package pl.sdacademy.designpattterns.duck;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DucksStatisticsTest {

    @Test
    public void shouldReturnOldestDuck(){
        //given
        Duck duck1 = mock(Duck.class);
        when(duck1.age()).thenReturn(15);

        Duck oldestDuck = mock(Duck.class);
        doReturn(555).when(oldestDuck).age();

        Duck duck3 = mock(Duck.class);
        doReturn(7).when(duck3).age();

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(duck1);
        ducks.add(oldestDuck);
        ducks.add(duck3);

        DucksStatistics ducksStatistics = new DucksStatistics(ducks);

        //when
        Integer age =ducksStatistics.getOldestDuckAge();

        //then
        Assert.assertEquals((Integer) 555, age);
    }


}
