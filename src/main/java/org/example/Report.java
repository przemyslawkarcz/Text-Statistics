package org.example;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Report {

    public void createsTextStatisticsReport() throws IOException {

        File newFile = new File("src/main/resources/Text-Statistics-Report.txt");

        if (!newFile.exists()){

            newFile.createNewFile();

        }

        PrintWriter printWriter = new PrintWriter("src/main/resources/Text-Statistics-Report.txt");

        Calculations calculations = new Calculations();

        printWriter.print("* * * Text-Statistics-Report (.txt) * * *");

        printWriter.println("\n\nWords: " + calculations.countsTotalWordsNumber());
        printWriter.println("Characters (with spaces): " + calculations.countsNumberOfCharactersWithSpaces());
        printWriter.println("Characters (without spaces): " + calculations.countsNumberOfCharactersWithoutSpaces());
        printWriter.println("Lines: " + calculations.countsLines());
        printWriter.println("\nCharacters individually: " + calculations.countsIndividualCharactersOfText());

        printWriter.close();


    }

}
