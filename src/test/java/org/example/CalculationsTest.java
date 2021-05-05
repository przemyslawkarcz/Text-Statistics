package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.FileNotFoundException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest extends TestCase {

    @Test
    public void testsMethodKeys_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

        Character key = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            key = map.getKey();

        }

        Assertions.assertNotEquals('#', key);

    }

    @Test
    public void testsMethodValues_CountsIndividualCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

        Integer value = null;

        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            value = map.getValue();

        }

        Assertions.assertNotEquals(100000, value);

    }


}