package UnitTests;

import com.example.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodShouldReturnMeat() throws Exception {

        com.example.Lion lion = new com.example.Lion("Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(java.util.List.of("Животные", "Птицы", "Рыба"));
        java.util.List<String> expectedResult = java.util.List.of("Животные", "Птицы", "Рыба");
        java.util.List<String> actualResult = lion.getFood();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }

    @Test
    public void getKittensReturnNumberOfKittens() throws Exception {

        com.example.Lion lion = new com.example.Lion("Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals("Метод работает неверно", expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeReturnsYes() throws Exception {

        com.example.Lion lion = new com.example.Lion("Самец");
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Метод работает неверно, у самца должна быть грива", expectedResult, actualResult);
    }
}


