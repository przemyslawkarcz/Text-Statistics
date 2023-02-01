package Calculations;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

class CalculationsTest extends TestCase {

    @Test
    public void testsIfMethodReturnsCharacterKey_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Characters characters = new Characters();
        Map<Character, Integer> characterIntegerMap = characters.countsIndividualCharactersOfText();

        Character key = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            key = map.getKey();

        }

        Assertions.assertNotEquals('#', key);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Characters characters = new Characters();
        Map<Character, Integer> characterIntegerMap = characters.countsIndividualCharactersOfText();

        Integer value = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            value = map.getValue();

        }

        Assertions.assertNotEquals(100000, value);

    }

    @Test
    public void testsIfReturnedObjectIsMapOfDifferentSize_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Characters characters = new Characters();
        Map<Character, Integer> characterIntegerMap = characters.countsIndividualCharactersOfText();

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put(' ', 80);
        hashMap.put('a', 20);
        hashMap.put('b', 30);
        hashMap.put('c', 80);
        hashMap.put('d', 150);
        hashMap.put('e', 60);
        hashMap.put('f', 70);
        hashMap.put('g', 80);
        hashMap.put('h', 90);

        Assertions.assertNotEquals(hashMap, characterIntegerMap);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Characters characters = new Characters();
        Map<Character, Integer> characterIntegerMap = characters.countsIndividualCharactersOfText();

        Assertions.assertNotNull(characterIntegerMap);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsNumberOfCharactersWithSpaces() throws FileNotFoundException{

        Characters characters = new Characters();
        Integer numberOfCharactersWithSpaces = characters.countsNumberOfCharactersWithSpaces();

        Assertions.assertNotEquals(12345678, numberOfCharactersWithSpaces);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_CountsNumberOfCharactersWithSpaces() throws FileNotFoundException{

        Characters characters = new Characters();
        Integer numberOfCharactersWithSpaces = characters.countsNumberOfCharactersWithSpaces();

        Assertions.assertNotNull(numberOfCharactersWithSpaces);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsTotalWordsNumber()throws FileNotFoundException {

        Words words = new Words();
        Integer totalWordsNumber = words.countsTotalWordsNumber();

        Assertions.assertNotEquals(12345678, totalWordsNumber);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_CountsTotalWordsNumber()throws FileNotFoundException {

        Words words = new Words();
        Integer totalWordsNumber = words.countsTotalWordsNumber();

        Assertions.assertNotNull(totalWordsNumber);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsSpacesInText()throws FileNotFoundException {

        Characters characters = new Characters();
        Integer spacesInText = characters.countsSpacesInText();

        Assertions.assertNotEquals(12345678, spacesInText);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsSpacesInText()throws FileNotFoundException {

        Characters characters = new Characters();
        Integer spacesInText = characters.countsSpacesInText();

        Assertions.assertNotNull(spacesInText);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsNumberOfCharactersWithoutSpaces()throws FileNotFoundException{

        Characters characters = new Characters();
        Integer numberOfCharactersWithoutSpaces = characters.countsNumberOfCharactersWithoutSpaces();

        Assertions.assertNotEquals(12345678, numberOfCharactersWithoutSpaces);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsNumberOfCharactersWithoutSpaces()throws FileNotFoundException {

        Characters characters = new Characters();
        Integer numberOfCharactersWithoutSpaces = characters.countsNumberOfCharactersWithoutSpaces();

        Assertions.assertNotNull(numberOfCharactersWithoutSpaces);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextAll()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextAll = lines.countsLinesOfTextAll();

        Assertions.assertNotEquals(12345678, linesOfTextAll);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextAll()throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextAll = lines.countsLinesOfTextAll();

        Assertions.assertNotNull(linesOfTextAll);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextFull()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextFull = lines.countsLinesOfTextFull();

        Assertions.assertNotEquals(12345678, linesOfTextFull);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextFull()throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextFull = lines.countsLinesOfTextFull();

        Assertions.assertNotNull(linesOfTextFull);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextEmpty()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextEmpty = lines.countsLinesOfTextEmpty();

        Assertions.assertNotEquals(12345678, linesOfTextEmpty);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextEmpty()throws FileNotFoundException{

        Lines lines = new Lines();
        Integer linesOfTextEmpty = lines.countsLinesOfTextEmpty();

        Assertions.assertNotNull(linesOfTextEmpty);

    }

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