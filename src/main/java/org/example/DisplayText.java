package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayText {

    //the method displays original text as it is, but the text is mapping to lines of text
    public String displaysOriginalTextMappedToLines () throws FileNotFoundException {

        int counter = 0;

        File originalFile = new File("C:\\Users\\pkarc\\IdeaProjects\\Text-Statistics\\src\\main\\resources\\Text.txt");

        Scanner textFromFIleThroughScanner = new Scanner(originalFile);

        String lineOfText = null;

        System.out.println();
        while (textFromFIleThroughScanner.hasNext()){

            counter++;

            lineOfText = textFromFIleThroughScanner.nextLine();

            System.out.println("Line " + counter + ": " + lineOfText);

        }

        return lineOfText;

    }

}
