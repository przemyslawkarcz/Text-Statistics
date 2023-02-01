package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;

public class LinesTest {

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextAll()throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextAll = lines.countsLinesOfTextAll();

        Assertions.assertNotEquals(12345678, linesOfTextAll);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextAll()throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextAll = lines.countsLinesOfTextAll();

        Assertions.assertNotNull(linesOfTextAll);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextFull()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextFull = lines.countsLinesOfTextFull();

        Assertions.assertNotEquals(12345678, linesOfTextFull);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextFull()throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextFull = lines.countsLinesOfTextFull();

        Assertions.assertNotNull(linesOfTextFull);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextEmpty()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextEmpty = lines.countsLinesOfTextEmpty();

        Assertions.assertNotEquals(12345678, linesOfTextEmpty);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextEmpty()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextEmpty = lines.countsLinesOfTextEmpty();

        Assertions.assertNotNull(linesOfTextEmpty);

    }

}
