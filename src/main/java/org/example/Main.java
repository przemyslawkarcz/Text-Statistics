package org.example;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //use this method 'displaysOriginalTextMappedToLines' to display the original text in full mapped to number of lines
        PrintClass printClass = new PrintClass();
        printClass.printsResultOfMethodDisplaysOriginalTextMappedToLines();

        //use this method 'countsLines' to display the number of lines of the original text
        printClass.printsResultOfMethodCountsLines();

        //use this method 'countsCharactersOfText' to count all characters in a text
        printClass.printsResultOfMethodCountsCharactersOfText();

        //use this method 'countsTotalNumberOfCharacters' to count total numbers of characters in a text
        printClass.printsResultOfMethodCountsTotalNumberOfCharacters();


    }

}
