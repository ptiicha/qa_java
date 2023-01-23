package UnitTests;

import org.junit.*;
import org.junit.runner.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

        com.example.Feline feline = new com.example.Feline();

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

            java.util.List<String> expectedResult = java.util.List.of("Животные", "Птицы", "Рыба");
            java.util.List<String> actualResult = feline.eatMeat();
            assertEquals("Метод работает неверно", expectedResult, actualResult);
        }
    }

