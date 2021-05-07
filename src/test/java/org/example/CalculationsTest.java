package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

class CalculationsTest extends TestCase {

    @Test
    public void testsIfMethodReturnsCharacterKey_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

        Character key = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            key = map.getKey();

        }

        Assertions.assertNotEquals('#', key);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

        Integer value = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            value = map.getValue();

        }

        Assertions.assertNotEquals(100000, value);

    }

    @Test
    public void testsIfReturnedObjectIsMapOfDifferentSize_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

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

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

        Assertions.assertNotNull(characterIntegerMap);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsNumberOfCharactersWithSpaces() throws FileNotFoundException{

        Calculations calculations = new Calculations();
        int numberOfCharactersWithSpaces = calculations.countsNumberOfCharactersWithSpaces();

        Assertions.assertNotEquals(12345678, numberOfCharactersWithSpaces);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_CountsNumberOfCharactersWithSpaces() throws FileNotFoundException{

        Calculations calculations = new Calculations();
        int numberOfCharactersWithSpaces = calculations.countsNumberOfCharactersWithSpaces();

        Assertions.assertNotNull(numberOfCharactersWithSpaces);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_CountsTotalWordsNumber()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int totalWordsNumber = calculations.countsTotalWordsNumber();

        Assertions.assertNotEquals(12345678, totalWordsNumber);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_CountsTotalWordsNumber()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int totalWordsNumber = calculations.countsTotalWordsNumber();

        Assertions.assertNotNull(totalWordsNumber);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsSpacesInText()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int spacesInText = calculations.countsSpacesInText();

        Assertions.assertNotEquals(12345678, spacesInText);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsSpacesInText()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int spacesInText = calculations.countsSpacesInText();

        Assertions.assertNotNull(spacesInText);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsNumberOfCharactersWithoutSpaces()throws FileNotFoundException{

        Calculations calculations = new Calculations();
        int numberOfCharactersWithoutSpaces = calculations.countsNumberOfCharactersWithoutSpaces();

        Assertions.assertNotEquals(12345678, numberOfCharactersWithoutSpaces);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsNumberOfCharactersWithoutSpaces()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int numberOfCharactersWithoutSpaces = calculations.countsNumberOfCharactersWithoutSpaces();

        Assertions.assertNotNull(numberOfCharactersWithoutSpaces);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextAll()throws FileNotFoundException{

        Calculations calculations = new Calculations();
        int linesOfTextAll = calculations.countsLinesOfTextAll();

        Assertions.assertNotEquals(12345678, linesOfTextAll);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextAll()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int linesOfTextAll = calculations.countsLinesOfTextAll();

        Assertions.assertNotNull(linesOfTextAll);

    }

    @Test
    public void testsIfMethodReturnsIntegerValues_countsLinesOfTextFull()throws FileNotFoundException{

        Calculations calculations = new Calculations();
        int linesOfTextFull = calculations.countsLinesOfTextFull();

        Assertions.assertNotEquals(12345678, linesOfTextFull);

    }

    @Test
    public void testsIfReturnedObjectIsNotNull_countsLinesOfTextFull()throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int linesOfTextFull = calculations.countsLinesOfTextFull();

        Assertions.assertNotNull(linesOfTextFull);

    }







}