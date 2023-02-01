package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmallLettersTest {

    @Test
    public void testsIfMethodReturnsIntegerValues01_countsNumberOfLowercaseLetters(){

        String exemplaryText = "It's good!";

        char[] charArray = exemplaryText.toCharArray();

        int counterOfLowercaseLetters = 0;

        char[] smallLettersArray = {'q', 'w', 'e', 'ę', 'r', 't', 'y', 'u', 'i', 'o', 'ó', 'p', 'a', 'ą', 's', 'ś', 'd', 'f', 'g',
                'h', 'j', 'k', 'l', 'ł', 'z', 'ź', 'ż', 'x', 'c', 'ć', 'v', 'b', 'n', 'ń', 'm'};

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < smallLettersArray.length; j++) {

                if (charArray[i] == smallLettersArray[j]){

                    counterOfLowercaseLetters++;

                }

            }

        }

        Assertions.assertEquals(6, counterOfLowercaseLetters);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues02_countsNumberOfLowercaseLetters(){

        String exemplaryText = "It's not good!";

        char[] charArray = exemplaryText.toCharArray();

        int counterOfLowercaseLetters = 0;

        char[] smallLettersArray = {'q', 'w', 'e', 'ę', 'r', 't', 'y', 'u', 'i', 'o', 'ó', 'p', 'a', 'ą', 's', 'ś', 'd', 'f', 'g',
                'h', 'j', 'k', 'l', 'ł', 'z', 'ź', 'ż', 'x', 'c', 'ć', 'v', 'b', 'n', 'ń', 'm'};

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < smallLettersArray.length; j++) {

                if (charArray[i] == smallLettersArray[j]){

                    counterOfLowercaseLetters++;

                }

            }

        }

        Assertions.assertNotEquals(10, counterOfLowercaseLetters);

    }

}
