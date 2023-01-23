package UnitTests;

import com.example.*;
import org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.*;

import java.util.*;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeowTest() {

        Cat cat = new Cat(new Feline());
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnMeatTest() throws Exception {

        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }
}
