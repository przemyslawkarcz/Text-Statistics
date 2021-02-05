package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Calculations {

    public void countsLines () throws FileNotFoundException {

        int counter = 0;

        File originalFile = new File("C:\\Users\\pkarc\\IdeaProjects\\Text-Statistics\\src\\main\\resources\\Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        while (textFromFileThroughScanner.hasNext()){

            counter++;

            textFromFileThroughScanner.nextLine();

        }

        System.out.println("No. of lines: " + counter);

    }

}
