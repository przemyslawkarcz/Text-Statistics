package org.example;

import java.io.IOException;

public class AppRunner {

    /*

    Below is a set of methods arranged in the correct and planned order.
    Calling them will perform all the actions that will contribute to the creation of the text statistics.
    The text file is Text.txt located in the resources directory, the text in this directory can be edited.
    The program output is displayed in the console and is also available in a text file with a report
    named Text-Statistics-Report.txt in the resources directory.

    */

    public static void main(String[] args) throws IOException {

        PrintClass printClass = new PrintClass();
        Report report = new Report();
        Text text = new Text();

        //creates once a new text file in which the text can be saved
        //text.createsTextFile();

        //prints the startup message
        printClass.printFriendlyInitialMessage();

        //use this method to count total number of words in text
        printClass.printsResultOfMethodCountsTotalWordsNumber();

        //use this method to count total numbers of all type characters in a text
        printClass.printsResultOfTheMethodCountsNumberOfCharactersWithSpaces();

        //use this method to display total number of characters without spaces
        printClass.printsResultOfMethodCountsTotalNumberOfCharactersWithoutSpaces();

        //use this method to display the number of lines of the original text i.e. all lines of text full and empty
        printClass.printsResultOfMethodCountsLinesOfTextAll();

        //use this method to display the number of full lines of the original text i.e. lines only with text
        printClass.printsResultOfMethodCountsLinesOfTextFull();

        //use this method to display the number of empty lines of the original text
        printClass.printsResultOfMethodCountsLinesOfTextEmpty();

        //use this method to count all individual characters in a text
        printClass.printsResultOfMethodCountsCharactersOfText();

        //use this method to write the calculated statistics down in report as 'Text-Statistics-Report.txt'
        report.createsTextStatisticsReport();

        //use this method to display the original text in full, mapped to number of lines
        /*
        printClass.printsResultOfMethodDisplaysOriginalTextMappedToLines();
        */

    }

}
