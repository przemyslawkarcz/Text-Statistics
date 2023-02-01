package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

public class WordsTest {

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsTotalWordsNumber()throws FileNotFoundException {

        Words words = new Words();
        Integer totalWordsNumber = words.countsTotalWordsNumber();

        Assertions.assertNotEquals(12345678, totalWordsNumber);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_CountsTotalWordsNumber()throws FileNotFoundException {

        Words words = new Words();
        Integer totalWordsNumber = words.countsTotalWordsNumber();

        Assertions.assertNotNull(totalWordsNumber);

    }

}
