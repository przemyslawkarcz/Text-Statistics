package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consonants {

    protected Integer countsNumberOfConsonants()throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfConsonants = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] consonantsArray = {'b', 'B', 'c', 'C', 'ć', 'Ć', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K',
                    'l', 'L', 'ł', 'Ł', 'm', 'M', 'n', 'N', 'ń', 'Ń', 'p', 'P', 'r', 'R', 's', 'S', 'ś', 'Ś', 't', 'T', 'w', 'W',
                    'x', 'X', 'z', 'Z', 'ź', 'Ź', 'ż', 'Ż'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < consonantsArray.length; j++) {

                    if (charArray[i] == consonantsArray[j]){

                        counterOfConsonants++;

                    }

                }

            }

        }

        return counterOfConsonants;

    }

}
