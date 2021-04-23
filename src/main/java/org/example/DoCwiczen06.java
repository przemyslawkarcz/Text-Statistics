package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoCwiczen06 {

    public static void main(String[] args) throws FileNotFoundException {

        countsLines();

    }

    public static void countsLines() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        int counterAllLines = 0;

        String lineOfText = "";

        String[] split;

        while (textFromFileThroughScanner.hasNextLine()){

            lineOfText = textFromFileThroughScanner.nextLine();

            //split = lineOfText.split("^$");


            if(!lineOfText.trim().isEmpty()){

                counterAllLines++;

                System.out.println("Linia " + counterAllLines + ": " + lineOfText);

                /*if (!lineOfText.equals("blank line")){

                    //System.out.print(lineOfText);

                }*/

            }


            //counterAllLines++;

            //System.out.println("Linia " + counterAllLines + ": " + lineOfText);

            /*for (String s:split) {
                System.out.println(s);
            }*/

        }

        System.out.println("L. wszystkich lini z pustymi: " + counterAllLines);
        //System.out.println("L. wszystkich lini pełnych: " + counterFullLines);

    }



}
