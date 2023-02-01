package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VowelsTest {

    @Test
    public void testsIfMethodReturnsIntegerValues01_countsNumberOfVowels(){

        String exemplaryText = "Ala has a cat";

        char[] charArray = exemplaryText.toCharArray();

        char[] vowelsArray = {'a', 'A', 'ą', 'Ą', 'e', 'E', 'ę', 'Ę', 'i', 'I', 'o', 'O', 'ó', 'Ó', 'u', 'U', 'y', 'Y'};

        int counterOfVowels = 0;

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < vowelsArray.length; j++) {

                if (charArray[i] == vowelsArray[j]){

                    counterOfVowels++;

                }

            }

        }

        Assertions.assertEquals(5, counterOfVowels);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues02_countsNumberOfVowels(){

        String exemplaryText = "Ala has a caterpillar";

        char[] charArray = exemplaryText.toCharArray();

        char[] vowelsArray = {'a', 'A', 'ą', 'Ą', 'e', 'E', 'ę', 'Ę', 'i', 'I', 'o', 'O', 'ó', 'Ó', 'u', 'U', 'y', 'Y'};

        int counterOfVowels = 0;

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < vowelsArray.length; j++) {

                if (charArray[i] == vowelsArray[j]){

                    counterOfVowels++;

                }

            }

        }

        Assertions.assertNotEquals(5, counterOfVowels);

    }

}
