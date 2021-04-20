package org.example;

import java.io.FileNotFoundException;

public class Main {

    /*

    General description of the demo .....

    */

    public static void main(String[] args) throws FileNotFoundException {

        PrintClass printClass = new PrintClass();

        //use this method to display the original text in full, mapped to number of lines
        printClass.printsResultOfMethodDisplaysOriginalTextMappedToLines();

        //use this method to display the number of lines of the original text
        printClass.printsResultOfMethodCountsLines();

        //use this method to count all individual characters in a text
        printClass.printsResultOfMethodCountsCharactersOfText();

        //use this method to count total numbers of all type characters in a text
        printClass.printsResultOfMethodCountsTotalNumberOfCharacters();

        //use this method to count total number of words in text
        printClass.printsResultOfMethodCountsTotalWordsNumber();


    }

}
