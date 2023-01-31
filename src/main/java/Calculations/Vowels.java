package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Vowels {

    protected Integer countsNumberOfVowels()throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfVowels = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] vowelsArray = {'a', 'A', 'ą', 'Ą', 'e', 'E', 'ę', 'Ę', 'i', 'I', 'o', 'O', 'ó', 'Ó', 'u', 'U', 'y', 'Y'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < vowelsArray.length; j++) {

                    if (charArray[i] == vowelsArray[j]){

                        counterOfVowels++;

                    }

                }

            }

        }

        return counterOfVowels;

    }

}
