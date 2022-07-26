package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplaceTest {

    @Test
    public void findCharactersReplaceCharacters(){

        char charToFind_1 = 'ł';
        char signToBeChangedToTheLeft = '#';
        char charToFind_2 = 'b';
        char signToBeChangedToTheRight = '$';

        String exemplaryText = "Siała baba mak";

        char[] charArray = exemplaryText.toCharArray();

        int desiredSizeOfCharArray = charArray.length + 2;

        char[] newProperCharArray = new char[desiredSizeOfCharArray];

        newProperCharArray[0] = ' ';
        newProperCharArray[newProperCharArray.length - 1] = ' ';

        for (int i = 0; i < charArray.length; i++) {

            newProperCharArray[i+1] = charArray[i];

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

        System.out.println("After changes: " + s);

        Assertions.assertEquals(" Si#ła b$b$ mak ", s);

    }

}
