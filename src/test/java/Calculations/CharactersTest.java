package Calculations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class CharactersTest {

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

}
