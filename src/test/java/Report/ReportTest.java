package Report;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;

class ReportTest extends TestCase {

    @Test
    public void testsIfFileExists_CreatesTextStatisticsReport() {

        File file = new File("src/main/resources/Text-Statistics-Report.txt");

        boolean exists = file.exists();

        Assertions.assertTrue(exists);

    }

    @Test
    public void testsIfFileIsOfClassFile_CreatesTextStatisticsReport() {

        File file = new File("src/main/resources/Text-Statistics-Report.txt");

        boolean isFile = file.isFile();

        Assertions.assertTrue(isFile);

    }

    @Test
    public void testsIfFileIsNotDirectory_CreatesTextStatisticsReport() {

        File file = new File("src/main/resources/Text-Statistics-Report.txt");

        boolean isDirectory = file.isDirectory();

        Assertions.assertFalse(isDirectory);

    }

    @Test
    public void testsIfFileIsReadable_CreatesTextStatisticsReport() {

        File file = new File("src/main/resources/Text-Statistics-Report.txt");

        boolean forReading = file.canRead();

        Assertions.assertTrue(forReading);

    }

    @Test
    public void testsIfFileIsWriteable_CreatesTextStatisticsReport() {

        File file = new File("src/main/resources/Text-Statistics-Report.txt");

        boolean forWriting = file.canWrite();

        Assertions.assertTrue(forWriting);

    }

    @Test
    public void testsIfFileNameIsCorrect_CreatesTextStatisticsReport() {

        File file = new File("src/main/resources/Text-Statistics-Report.txt");

        String fileName = file.getName();

        Assertions.assertEquals("Text-Statistics-Report.txt", fileName);

    }

}