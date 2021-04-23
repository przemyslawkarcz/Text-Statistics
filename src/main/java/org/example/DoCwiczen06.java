package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoCwiczen06 {

    public static void main(String[] args) throws FileNotFoundException {

        countsParagraphs();

    }

    public static void countsLines() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterAllLines = 0;

        String lineOfText = "";

        String[] split;

        int totalWordsNumber = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            if(!lineOfText.trim().isEmpty()){

                counterAllLines++;

                System.out.println("Linia " + counterAllLines + ": " + lineOfText);

                split = lineOfText.split("[ ]+");

                totalWordsNumber = totalWordsNumber + split.length;
            }


        }

        System.out.println("Liczba słów: " + totalWordsNumber);

    }

    public static void countsParagraphs() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterAllLines = 0;
        int counterFullLines = 0;
        int counterEmptyLines = 0;

        String lineOfText = "";

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            counterAllLines++;

            if(!lineOfText.trim().isEmpty()){

                counterFullLines++;

                //System.out.println("Linia " + counterFullLines + ": " + lineOfText);

            }else {

                counterEmptyLines++;

                //System.out.println("Linia " + counterEmptyLines + ": " + lineOfText);

            }

        }

        System.out.println("L. lini wszystkich: " + counterAllLines);
        System.out.println("L. lini pełnych: " + counterFullLines);
        System.out.println("L. lini pustych: " + counterEmptyLines);
        System.out.println("L. akapitów: ");

    }



}
