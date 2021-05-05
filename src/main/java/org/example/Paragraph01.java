package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Paragraph01 {

    public static void main(String[] args) throws FileNotFoundException {

        countsParagraphs();

    }

    public static void countsParagraphs() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterAllLines = 0;
        int counterFullLines = 0;
        int counterEmptyLines = 0;
        int counterParagraphs = 0;

        boolean full;
        boolean empty;

        String lineOfText = "";

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            counterAllLines++;

            if(!lineOfText.trim().isEmpty()){

                counterFullLines++;

                //lineOfText = "full";
                //System.out.println("Linia " + counterFullLines + ": " + lineOfText);
                System.out.println(lineOfText + ": " + lineOfText.length());

            }else {

                counterEmptyLines++;

                lineOfText = "";
                //System.out.println("Linia " + counterEmptyLines + ": " + lineOfText);
                System.out.println(lineOfText + ": " + lineOfText.length());

            }


        }

        System.out.println("L. lini wszystkich: " + counterAllLines);
        System.out.println("L. lini pełnych: " + counterFullLines);
        System.out.println("L. lini pustych: " + counterEmptyLines);
        System.out.println("L. akapitów: " + counterParagraphs);

        while (textFromFileThroughScanner.hasNextLine()){

            String line = textFromFileThroughScanner.nextLine();

            System.out.println(lineOfText);

        }

    }

}
