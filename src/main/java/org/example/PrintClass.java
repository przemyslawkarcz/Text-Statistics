package org.example;

import java.io.FileNotFoundException;
import java.util.Map;

public class PrintClass {

    public void printsResultOfMethodDisplaysOriginalTextMappedToLines() throws FileNotFoundException {

        DisplayText displayText = new DisplayText();
        displayText.displaysOriginalTextMappedToLines();

    }

    public void printsResultOfMethodCountsLines() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int countsLines = calculations.countsLines();

        System.out.println("\nNo. of all lines: " + countsLines);

    }

    public void printsResultOfMethodCountsCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsCharactersOfText();

        System.out.println("\nK:V");
        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            Character key = map.getKey();
            Integer value = map.getValue();

            System.out.println(key + ":" + value);

        }

    }

    public void printsResultOfMethodCountsTotalNumberOfCharacters() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int totalNumberOfCharacters = calculations.countsTotalNumberOfCharacters();


        System.out.print("\nTotal number of all characters in text file: " + totalNumberOfCharacters);

    }


}
