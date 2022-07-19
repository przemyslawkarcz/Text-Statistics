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

    //the method displays original text as it is, but the text is mapping to lines of text
    public void displaysOriginalTextMappedToLines () throws FileNotFoundException {

        int counter = 0;

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFIleThroughScanner = new Scanner(originalFile);

        String lineOfText;

        System.out.println();
        while (textFromFIleThroughScanner.hasNext()){

            counter++;

            lineOfText = textFromFIleThroughScanner.nextLine();

            System.out.println("Line " + counter + ": " + lineOfText);

        }

    }

    //the method displays total number of vowels in the text
    public Integer countsNumberOfVowels()throws FileNotFoundException{

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfVowels = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] vowelsArray = {'a', 'A', 'ą', 'Ą', 'e', 'E', 'ę', 'Ę', 'i', 'I', 'o', 'O', 'ó', 'Ó', 'u', 'U', 'y', 'Y'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < vowelsArray.length; j++) {

                    if (charArray[i] == vowelsArray[j]){

                        counterOfVowels++;

                    }

                }

            }

        }

        return counterOfVowels;

    }

    //the method displays total number of consonants in the text
    public Integer countsNumberOfConsonants()throws FileNotFoundException{

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfConsonants = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] consonantsArray = {'b', 'B', 'c', 'C', 'ć', 'Ć', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K',
                    'l', 'L', 'ł', 'Ł', 'm', 'M', 'n', 'N', 'ń', 'Ń', 'p', 'P', 'r', 'R', 's', 'S', 'ś', 'Ś', 't', 'T', 'w', 'W',
                    'x', 'X', 'z', 'Z', 'ź', 'Ź', 'ż', 'Ż'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < consonantsArray.length; j++) {

                    if (charArray[i] == consonantsArray[j]){

                        counterOfConsonants++;

                    }

                }

            }

        }

        return counterOfConsonants;

    }

    //the method displays total number of consonants in the text
    public Integer countsNumberOfSpecialSigns()throws FileNotFoundException{

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterOfSpecialSigns = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            char[] charArray = lineOfText.toCharArray();

            char[] specialSignsArray = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=', '{',
            '}', '[', ']', '|', ':', ';', '"', '<', '>', ',', '.', '?', '/', '~', '`'};

            for (int i = 0; i < charArray.length; i++) {

                for (int j = 0; j < specialSignsArray.length; j++) {

                    if (charArray[i] == specialSignsArray[j]){

                        counterOfSpecialSigns++;

                    }

                }

            }

        }

        return counterOfSpecialSigns;

    }

}
