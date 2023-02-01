package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpecialSignsTest {

    @Test
    public void testsIfMethodReturnsIntegerValues01_countsNumberOfSpecialSigns(){

        String exemplaryText = "Curses in comics write like this: !@#$";

        char[] charArray = exemplaryText.toCharArray();

        int counterOfSpecialSigns = 0;

        char[] specialSignsArray = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '{',
                '}', '[', ']', '|', ':', ';', '"', '<', '>', ',', '.', '?', '/', '~', '`'};

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < specialSignsArray.length; j++) {

                if (charArray[i] == specialSignsArray[j]){

                    counterOfSpecialSigns++;

                }

            }

        }

        Assertions.assertEquals(5, counterOfSpecialSigns);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues02_countsNumberOfSpecialSigns(){

        String exemplaryText = "it's best not to use curses like this: !@#$";

        char[] charArray = exemplaryText.toCharArray();

        int counterOfSpecialSigns = 0;

        char[] specialSignsArray = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '{',
                '}', '[', ']', '|', ':', ';', '"', '<', '>', ',', '.', '?', '/', '~', '`'};

        for (int i = 0; i < charArray.length; i++) {

            for (int j = 0; j < specialSignsArray.length; j++) {

                if (charArray[i] == specialSignsArray[j]){

                    counterOfSpecialSigns++;

                }

            }

        }

        Assertions.assertNotEquals(6, counterOfSpecialSigns);

    }

}
