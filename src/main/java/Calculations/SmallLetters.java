package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SmallLetters {

    protected Integer countsNumberOfSmallLetters()throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfSmallLetters = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] smallLettersArray = {'q', 'w', 'e', 'ę', 'r', 't', 'y', 'u', 'i', 'o', 'ó', 'p', 'a', 'ą', 's', 'ś', 'd', 'f', 'g',
                    'h', 'j', 'k', 'l', 'ł', 'z', 'ź', 'ż', 'x', 'c', 'ć', 'v', 'b', 'n', 'ń', 'm'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < smallLettersArray.length; j++) {

                    if (charArray[i] == smallLettersArray[j]){

                        counterOfSmallLetters++;

                    }

                }

            }

        }

        return counterOfSmallLetters;

    }

}
