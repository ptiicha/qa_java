package UnitTests;

import com.example.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodShouldReturnMeat() throws Exception {

        Lion lion = new Lion("Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }

    @Test
    public void getKittensReturnNumberOfKittens() throws Exception {

        Lion lion = new Lion("Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeReturnsYes() throws Exception {

        Lion lion = new Lion("Самец");
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Метод работает неверно, у самца должна быть грива", expectedResult, actualResult);
    }
}


