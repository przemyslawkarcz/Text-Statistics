package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsonantsTest {

    @Test
    public void testsIfMethodReturnsIntegerValues01_countsNumberOfConsonants(){

        String exemplaryText = "Ala has a hat";

        char[] charArray = exemplaryText.toCharArray();

        char[] consonantsArray = {'b', 'B', 'c', 'C', 'ć', 'Ć', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K',
                'l', 'L', 'ł', 'Ł', 'm', 'M', 'n', 'N', 'ń', 'Ń', 'p', 'P', 'r', 'R', 's', 'S', 'ś', 'Ś', 't', 'T', 'w', 'W',
                'x', 'X', 'z', 'Z', 'ź', 'Ź', 'ż', 'Ż'};

        int counterOfConsonants = 0;

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < consonantsArray.length; j++) {

                if (charArray[i] == consonantsArray[j]){

                    counterOfConsonants++;

                }

            }

        }

        Assertions.assertEquals(5, counterOfConsonants);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues02_countsNumberOfConsonants(){

        String exemplaryText = "Ala meets a hatter";

        char[] charArray = exemplaryText.toCharArray();

        char[] consonantsArray = {'b', 'B', 'c', 'C', 'ć', 'Ć', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K',
                'l', 'L', 'ł', 'Ł', 'm', 'M', 'n', 'N', 'ń', 'Ń', 'p', 'P', 'r', 'R', 's', 'S', 'ś', 'Ś', 't', 'T', 'w', 'W',
                'x', 'X', 'z', 'Z', 'ź', 'Ź', 'ż', 'Ż'};

        int counterOfConsonants = 0;

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < consonantsArray.length; j++) {

                if (charArray[i] == consonantsArray[j]){

                    counterOfConsonants++;

                }

            }

        }

        Assertions.assertNotEquals(7, counterOfConsonants);

    }

}
