package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lines {

    protected Integer countsLinesOfTextAll() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterAllLines = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            textFromFileThroughScanner.nextLine();

            counterAllLines++;

        }

        return counterAllLines;

    }

    protected Integer countsLinesOfTextFull() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterFullLines = 0;

        String lineOfText;

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            if(!lineOfText.trim().isEmpty()){

                counterFullLines++;

            }

        }

        return counterFullLines;

    }

    protected Integer countsLinesOfTextEmpty() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterEmptyLines = 0;

        String lineOfText;

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            if(lineOfText.trim().isEmpty()){

                counterEmptyLines++;

            }

        }

        return counterEmptyLines;

    }

    protected void displaysOriginalTextMappedToLines () throws FileNotFoundException {

        int counter = 0;

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFIleThroughScanner = new Scanner(originalFile);

        String lineOfText;

        System.out.println();
        while (textFromFIleThroughScanner.hasNext()){

            counter++;

            lineOfText = textFromFIleThroughScanner.nextLine();

            System.out.println("Line " + counter + ": " + lineOfText);

        }

    }

}
