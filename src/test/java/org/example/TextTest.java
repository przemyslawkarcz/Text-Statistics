package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class TextTest extends TestCase {

    @Test
    public void testsIfFileExists_CreatesTextFile() {

        File file = new File("src/main/resources/Text.txt");

        boolean exists = file.exists();

        Assertions.assertTrue(exists);

    }

    @Test
    public void testsIfFileIsOfClassFile_CreatesTextFile() {

        File file = new File("src/main/resources/Text.txt");

        boolean isFile = file.isFile();

        Assertions.assertTrue(isFile);

    }

    @Test
    public void testsIfFileIsNotDirectory_CreatesTextFilet() {

        File file = new File("src/main/resources/Text.txt");

        boolean isDirectory = file.isDirectory();

        Assertions.assertFalse(isDirectory);

    }

    @Test
    public void testsIfFileIsReadable_CreatesTextFile() {

        File file = new File("src/main/resources/Text.txt");

        boolean forReading = file.canRead();

        Assertions.assertTrue(forReading);

    }

    @Test
    public void testsIfFileIsWriteable_CreatesTextFile() {

        File file = new File("src/main/resources/Text.txt");

        boolean forWriting = file.canWrite();

        Assertions.assertTrue(forWriting);

    }

    @Test
    public void testsIfFileNameIsCorrect_CreatesTextFile() {

        File file = new File("src/main/resources/Text.txt");

        String fileName = file.getName();

        Assertions.assertEquals("Text.txt", fileName);

    }

}