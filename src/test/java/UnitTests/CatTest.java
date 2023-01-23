package UnitTests;

import com.example.*;
import org.junit.*;
import org.junit.Assert.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnMeowTest() {

        com.example.Cat cat = new com.example.Cat(new com.example.Feline());
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnMeatTest() throws Exception {

        com.example.Cat cat = new com.example.Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(java.util.List.of("Животные", "Птицы", "Рыба"));
        java.util.List<String> expectedResult = java.util.List.of("Животные", "Птицы", "Рыба");
        java.util.List<String> actualResult = cat.getFood();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }
}
