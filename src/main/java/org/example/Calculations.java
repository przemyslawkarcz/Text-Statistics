package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculations {

    //the method counts all individual characters in text e.g. number of 'a' or 'z' or 'A' or 'Z' or '?' etc ...
    public Map<Character, Integer> countsIndividualCharactersOfText() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            for (char c : charArray) {

                if (!characterIntegerMap.containsKey(c)) {

                    characterIntegerMap.put(c, 1);

                } else {

                    Integer counter = characterIntegerMap.get(c);
                    counter++;
                    characterIntegerMap.put(c, counter);
                }

            }

        }

        return characterIntegerMap;

    }

    //the method counts all characters in the text with spaces and presents the result as a total number of characters
    public Integer countsNumberOfCharactersWithSpaces() throws FileNotFoundException {

        Map<Character, Integer> characterIntegerMap = countsIndividualCharactersOfText();

        Collection<Integer> values = characterIntegerMap.values();

        int charactersTotalWithSpaces = 0;

        Object[] array = values.toArray();

        for (Object o : array) {

            Integer integer = (Integer) o;

            charactersTotalWithSpaces = charactersTotalWithSpaces + integer;

        }

        return charactersTotalWithSpaces;

    }

    //the method counts total number of words
    public Integer countsTotalWordsNumber() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        String lineOfText;

        String[] split;

        int totalWordsNumber = 0;

        while (textFromFileThroughScanner.hasNextLine()) {

            lineOfText = textFromFileThroughScanner.nextLine();

            if (!lineOfText.trim().isEmpty()){

                split = lineOfText.split("[ ]+");

                totalWordsNumber = totalWordsNumber + split.length;

            }

        }

        return totalWordsNumber;

    }

    //the method counts total number of spaces
    public Integer countsSpacesInText() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counter = 0;

        while (textFromFileThroughScanner.hasNextLine()) {

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            for (char c : charArray) {

                if (c == ' ') {

                    counter++;

                }

            }

        }

        return counter;
    }

    public Integer countsNumberOfCharactersWithoutSpaces() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int allCharactersWithSpaces = calculations.countsNumberOfCharactersWithSpaces();
        int allSpacesInText = calculations.countsSpacesInText();

        return allCharactersWithSpaces - allSpacesInText;
    }

    //the method counts all rows of some document i.e. full of text and completely empty
    public Integer countsLinesOfTextAll() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterAllLines = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            textFromFileThroughScanner.nextLine();

            counterAllLines++;

        }

        return counterAllLines;

    }

    //the method counts all full rows of some document i.e. fulfilled with et least one character
    public Integer countsLinesOfTextFull() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterFullLines = 0;

        String lineOfText;

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            if(!lineOfText.trim().isEmpty()){

                counterFullLines++;

            }

        }

        return counterFullLines;

    }

    //the method counts all rows of some document which are empty
    public Integer countsLinesOfTextEmpty() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterEmptyLines = 0;

        String lineOfText;

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            if(lineOfText.trim().isEmpty()){

                counterEmptyLines++;

            }

        }

        return counterEmptyLines;

    }
}
