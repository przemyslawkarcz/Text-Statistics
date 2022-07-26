package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Replace {

    /*

    The task of this class is to store the methods that are responsible for finding characters in the text
    and replacing the characters immediately next to the searched characters

    */

    //Method that replaces characters in the text according to the scheme:
    //- We choose the first character that will be found in the text and we choose the character that
    //  will be inserted into the text to the left of the found character.
    //- Then again, we give two characters, the first to find and the second to insert into the text,
    //  but this time the inserted character will go to the right side of the searched character.
    public void findCharactersReplaceCharacters(char charToFind_1, char signToBeChangedToTheLeft,
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
