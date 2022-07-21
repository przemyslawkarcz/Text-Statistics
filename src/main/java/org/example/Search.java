package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

    /*

    The task of this class is to store the methods that are responsible for finding words in the text, and not generate text statistics

    */

    //method that looks up words in the text
    public void searchWordsInText (String textToSearch) throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        String[] separatedText;

        int rowsCounter = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            String lineOfText = textFromFileThroughScanner.nextLine();

            separatedText = lineOfText.split("[ ]");

            rowsCounter++;

            for (int i = 0; i < separatedText.length; i++) {

                if (separatedText[i].equalsIgnoreCase(textToSearch)){

                    System.out.println("Found: '" + separatedText[i] + "', in row no.: " + rowsCounter);

                }

            }

        }

    }

}
