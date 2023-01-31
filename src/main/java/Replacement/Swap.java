package Replacement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Swap {

    protected void findCharactersReplaceCharactersNextToSearchedOne(
                                                char charToFind_1, char signToBeChangedToTheLeft,
                                                char charToFind_2, char signToBeChangedToTheRight)
                                                                    throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int rowCounter = 1;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] separatedChars = lineOfText.toCharArray();

            int desiredSizeOfCharArray = separatedChars.length + 2;

            char[] newProperCharArray = new char[desiredSizeOfCharArray];

            newProperCharArray[0] = ' ';
            newProperCharArray[newProperCharArray.length - 1] = ' ';

            for (int i = 0; i < separatedChars.length; i++) {

                newProperCharArray[i+1] = separatedChars[i];

            }

            for (int i = 0; i < newProperCharArray.length; i++) {

                if (newProperCharArray[i] == charToFind_1){

                    newProperCharArray[i-1] = signToBeChangedToTheLeft;

                }

                if (newProperCharArray[i] == charToFind_2){

                    newProperCharArray[i+1] = signToBeChangedToTheRight;

                }

            }

            String s = new String(newProperCharArray);

            System.out.println(rowCounter++ + ": " + s);

        }

    }

}
