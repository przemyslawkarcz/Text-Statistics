package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Words {

    protected Integer countsTotalWordsNumber() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        String lineOfText;

        String[] split;

        int totalWordsNumber = 0;

        while (textFromFileThroughScanner.hasNextLine()) {

            lineOfText = textFromFileThroughScanner.nextLine();

            if (!lineOfText.trim().isEmpty()){

                split = lineOfText.split("[ ]+");

                totalWordsNumber = totalWordsNumber + split.length;

            }

        }

        return totalWordsNumber;

    }

}
