package org.example;

import java.io.FileNotFoundException;
import java.util.Map;

public class PrintClass {

    //the purpose of creating the print class was to list the print methods
    //in which only the code responsible for formatting the print can be created;
    //as a consequence, computational functions of methods were separated from those that format the printout

    //the method prints original text which is mapped to lines (rows)
    public void printsResultOfMethodDisplaysOriginalTextMappedToLines() throws FileNotFoundException {

        System.out.print("* * * Original text mapped to lines * * *");
        DisplayText displayText = new DisplayText();
        displayText.displaysOriginalTextMappedToLines();

    }

    //the method prints results of the method 'countsLines'
    public void printsResultOfMethodCountsLines() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int countsLines = calculations.countsLines();

        System.out.println("Lines: " + countsLines);

    }

    //the method prints results of the method 'countsCharactersOfText'
    public void printsResultOfMethodCountsCharactersOfText() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        Map<Character, Integer> characterIntegerMap = calculations.countsIndividualCharactersOfText();

        System.out.println("\nCharacters individually: ");
        System.out.println("C-character : A-amount");
        System.out.println("C:A");
        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            Character key = map.getKey();
            Integer value = map.getValue();

            System.out.println(key + ":" + value);

        }

    }

    //the method prints results of the method 'countsTotalNumberOfCharacters'
    public void printsResultOfTheMethodCountsNumberOfCharactersWithSpaces() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int totalNumberOfCharacters = calculations.countsNumberOfCharactersWithSpaces();

        System.out.println("Characters (with spaces): " + totalNumberOfCharacters);

    }

    //the method prints results of the method 'countsTotalWordsNumber'
    public void printsResultOfMethodCountsTotalWordsNumber() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int totalWordsNumber = calculations.countsTotalWordsNumber();

        System.out.println("\nWords: " + totalWordsNumber);

    }

    //the method prints results of the method 'countsTotalNumberOfCharactersWithoutSpaces'
    public void printsResultOfMethodCountsTotalNumberOfCharactersWithoutSpaces() throws FileNotFoundException {

        Calculations calculations = new Calculations();
        int numberOfCharactersWithoutSpaces = calculations.countsNumberOfCharactersWithoutSpaces();

        System.out.println("Characters (without spaces): " + numberOfCharactersWithoutSpaces);
    }

    public void printFriendlyInitialMessage(){

        System.out.println("* * * Text-Statistics * * *");

    }


}
