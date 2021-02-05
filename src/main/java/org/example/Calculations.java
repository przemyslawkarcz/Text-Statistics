package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculations {

    public void countsLines () throws FileNotFoundException {

        int counter = 0;

        File originalFile = new File("C:\\Users\\pkarc\\IdeaProjects\\Text-Statistics\\src\\main\\resources\\Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        while (textFromFileThroughScanner.hasNext()){

            counter++;

            textFromFileThroughScanner.nextLine();

        }

        System.out.println("\nNo. of all lines: " + counter);

    }

    public Map<Character, Integer> countsCharactersOfText() throws FileNotFoundException {

        File originalFile = new File("C:\\Users\\pkarc\\IdeaProjects\\Text-Statistics\\src\\main\\resources\\Text.txt");

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

        System.out.println("\nK:V");
        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            Character key = map.getKey();
            Integer value = map.getValue();

            System.out.println(key + ":" + value);

        }

        return characterIntegerMap;

    }

    public void countsTotalNumberOfCharacters() throws FileNotFoundException {

        Map<Character, Integer> characterIntegerMap = countsCharactersOfText();

        Collection<Integer> values = characterIntegerMap.values();

        int charactersTotal = 0;

        Object[] array = values.toArray();

        for (int i = 0; i < array.length; i++) {

            Integer integer = (Integer) array[i];

            charactersTotal = charactersTotal + integer;

        }

        System.out.print("\nTotal number of all characters in text file: " + charactersTotal);

    }

}
