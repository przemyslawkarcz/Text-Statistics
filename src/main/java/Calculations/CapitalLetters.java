package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CapitalLetters {

    protected Integer countsNumberOfCapitalLetters()throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfCapitalLetters = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] capitalLettersArray = {'Q', 'W', 'E', 'Ę', 'R', 'T', 'Y', 'U', 'I', 'O', 'Ó', 'P', 'A', 'Ą', 'S', 'Ś', 'D', 'F', 'G',
                    'H', 'J', 'K', 'L', 'Ł', 'Z', 'Ź', 'Ż', 'X', 'C', 'Ć', 'V', 'B', 'N', 'Ń', 'M'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < capitalLettersArray.length; j++) {

                    if (charArray[i] == capitalLettersArray[j]){

                        counterOfCapitalLetters++;

                    }

                }

            }

        }

        return counterOfCapitalLetters;

    }

}
