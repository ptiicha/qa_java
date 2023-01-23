package UnitTests;

import com.example.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.junit.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

        Feline feline = new Feline();

        @Test
        public void getFamilyReturnsFeline() {

            String expectedResult = "Кошачьи";
            String actualResult = feline.getFamily();
            assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
        }

        @Test
        public void getKittensCountReturnOne() {

            int expectedResult = 1;
            int actualResult = feline.getKittens();
            assertEquals("Метод работает неверно", expectedResult, actualResult);
          }

        @Test
        public void eatMeatReturnsMeat() throws Exception {

            List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
            List<String> actualResult = feline.eatMeat();
            assertEquals("Метод работает неверно", expectedResult, actualResult);
        }
    }

