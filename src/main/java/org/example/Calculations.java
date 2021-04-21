package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculations {

    //the method is responsible for counting lines (rows) of original text
    public int countsLines () throws FileNotFoundException {

        int counter = 0;

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        while (textFromFileThroughScanner.hasNext()){

            counter++;

            textFromFileThroughScanner.nextLine();

        }

        return counter;

    }

    //the method counts all individual characters in text e.g. number of 'a' or 'z' or 'A' or 'Z' or '?' etc ...
    public Map<Character, Integer> countsIndividualCharactersOfText() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            for (int i = 0; i < charArray.length; i++) {

                char c = charArray[i];

                if (!characterIntegerMap.containsKey(charArray[i])){

                    characterIntegerMap.put(charArray[i], 1);

                }else {

                    Integer counter = characterIntegerMap.get(charArray[i]);
                    counter++;
                    characterIntegerMap.put(charArray[i], counter);
                }

            }

        }

        return characterIntegerMap;

    }

    //the method counts all characters in the text with spaces and presents the result as a total number of characters
    public int countsNumberOfCharactersWithSpaces() throws FileNotFoundException {

        Map<Character, Integer> characterIntegerMap = countsIndividualCharactersOfText();

        Collection<Integer> values = characterIntegerMap.values();

        int charactersTotalWithSpaces = 0;

        Object[] array = values.toArray();

        for (int i = 0; i < array.length; i++) {

            Integer integer = (Integer) array[i];

            charactersTotalWithSpaces = charactersTotalWithSpaces + integer;

        }

        return charactersTotalWithSpaces;

    }

    //the method counts total number of words
    public int countsTotalWordsNumber() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        String[] s;

        int totalWordsNumber = 0;

        while (textFromFileThroughScanner.hasNextLine()) {

            String lineOfText = textFromFileThroughScanner.nextLine();

            s = lineOfText.split("[ ]");

            totalWordsNumber = totalWordsNumber + s.length;

        }

        return totalWordsNumber;

    }

    //the method counts total number of spaces
    public int countsSpacesInText() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counter = 0;

        while (textFromFileThroughScanner.hasNextLine()) {

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            for (int i = 0; i < charArray.length; i++) {

                char c = charArray[i];

                if (c == ' ') {

                    counter++;

                }

            }

        }

        return counter;
    }

    public int countsNumberOfCharactersWithoutSpaces() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int allCharactersWithSpaces = calculations.countsNumberOfCharactersWithSpaces();
        int allSpacesInText = calculations.countsSpacesInText();

        return allCharactersWithSpaces - allSpacesInText;
    }

}
