package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Paragraph02 {

    public static void main(String[] args) throws FileNotFoundException {

        countsParagraphs();


    }

    public static void countsParagraphs() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner originalFileThroughScanner = new Scanner(originalFile);

        int counter = 0;

        while (originalFileThroughScanner.hasNextLine()){

            String line = originalFileThroughScanner.nextLine();

            boolean emptyLine = line.trim().isEmpty();
            boolean fullLine = (!line.trim().isEmpty());


            /*if (fullLine){

                counter++;
                System.out.println(counter);

            }*/



            if (!line.isEmpty()){

                counter++;
                System.out.println(counter + ": " + line);


            }

        }

    }

}
