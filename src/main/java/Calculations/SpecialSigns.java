package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpecialSigns {

    protected Integer countsNumberOfSpecialSigns()throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfSpecialSigns = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] specialSignsArray = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '{',
                    '}', '[', ']', '|', ':', ';', '"', '<', '>', ',', '.', '?', '/', '~', '`'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < specialSignsArray.length; j++) {

                    if (charArray[i] == specialSignsArray[j]){

                        counterOfSpecialSigns++;

                    }

                }

            }

        }

        return counterOfSpecialSigns;

    }

}
