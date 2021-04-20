package org.example;

import java.io.File;
import java.io.FileNotFoundException;
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

        printWriter.print("* * * Text-Statistics-Report * * *");

        printWriter.println("\n\n* * * The number of lines * * *");
        printWriter.println("Total no. of all lines (rows): " + calculations.countsLines());

        printWriter.println("\n* * * Sum of individual characters * * *");
        printWriter.println(calculations.countsCharactersOfText());

        printWriter.println("\n* * * Characters total * * *");
        printWriter.println("Amount: " + calculations.countsTotalNumberOfCharacters());

        printWriter.println("\n* * * Words total * * *");
        printWriter.println("Amount: " + calculations.countsTotalWordsNumber());



        printWriter.close();


    }

}
