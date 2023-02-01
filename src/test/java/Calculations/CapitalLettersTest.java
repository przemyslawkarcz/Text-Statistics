package Calculations;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CapitalLettersTest extends TestCase {

    @Test
    public void testsIfMethodReturnsIntegerValues01_countsNumberOfCapitalLetters(){

        String exemplaryText = "It's OK!";

        char[] charArray = exemplaryText.toCharArray();

        int counterOfUppercaseLetters = 0;

        char[] capitalLettersArray = {'Q', 'W', 'E', 'Ę', 'R', 'T', 'Y', 'U', 'I', 'O', 'Ó', 'P', 'A', 'Ą', 'S', 'Ś', 'D', 'F', 'G',
                'H', 'J', 'K', 'L', 'Ł', 'Z', 'Ź', 'Ż', 'X', 'C', 'Ć', 'V', 'B', 'N', 'Ń', 'M'};

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < capitalLettersArray.length; j++) {

                if (charArray[i] == capitalLettersArray[j]){

                    counterOfUppercaseLetters++;

                }

            }

        }

        Assertions.assertEquals(3, counterOfUppercaseLetters);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues02_countsNumberOfCapitalLetters(){

        String exemplaryText = "It's NOT OK!";

        char[] charArray = exemplaryText.toCharArray();

        int counterOfUppercaseLetters = 0;

        char[] capitalLettersArray = {'Q', 'W', 'E', 'Ę', 'R', 'T', 'Y', 'U', 'I', 'O', 'Ó', 'P', 'A', 'Ą', 'S', 'Ś', 'D', 'F', 'G',
                'H', 'J', 'K', 'L', 'Ł', 'Z', 'Ź', 'Ż', 'X', 'C', 'Ć', 'V', 'B', 'N', 'Ń', 'M'};

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < capitalLettersArray.length; j++) {

                if (charArray[i] == capitalLettersArray[j]){

                    counterOfUppercaseLetters++;

                }

            }

        }

        Assertions.assertNotEquals(5, counterOfUppercaseLetters);

    }

}