package Calculations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Characters {

    protected Map<Character, Integer> countsIndividualCharactersOfText() throws FileNotFoundException {

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

    protected Integer countsNumberOfCharactersWithSpaces() throws FileNotFoundException {

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

    protected Integer countsSpacesInText() throws FileNotFoundException {

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

    protected Integer countsNumberOfCharactersWithoutSpaces() throws FileNotFoundException {

        Characters characters = new Characters();
        int allCharactersWithSpaces = characters.countsNumberOfCharactersWithSpaces();
        int allSpacesInText = characters.countsSpacesInText();

        return allCharactersWithSpaces - allSpacesInText;
    }

}
