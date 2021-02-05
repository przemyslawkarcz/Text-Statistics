package org.example;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //use this method 'displaysOriginalTextMappedToLines' to display the original text in full mapped to number of lines
        DisplayText displayText = new DisplayText();
        displayText.displaysOriginalTextMappedToLines();

        //use this method 'countsLines' to display the number of lines of the original text
        Calculations calculations = new Calculations();
        calculations.countsLines();

        //use this method 'countsCharactersOfText' to count all characters in a text
        calculations.countsCharactersOfText();

    }

}
