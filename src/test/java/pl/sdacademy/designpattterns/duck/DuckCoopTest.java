package pl.sdacademy.designpattterns.duck;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class DuckCoopTest {


    @Test
        public void testDuckTwoKnowAboutEgg() {
            // Given
        Duck duck1 = mock (Duck.class);
        Duck duck2 = mock (Duck.class);

        doReturn(1).when(duck1).layEgg();



            // When

            // Then
    }

}