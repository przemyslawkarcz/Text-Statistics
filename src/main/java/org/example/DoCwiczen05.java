package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoCwiczen05 {

    public static void main(String[] args) throws FileNotFoundException {

        countsWords();

    }

    public static void countsWords() throws FileNotFoundException {

        File originalFile = new File("src/main/resources/Text.txt");

        Scanner textFromFileThroughScanner = new Scanner(originalFile);

        String nextLine = "";

        String[] split;

        int totalWordsAmount = 0;

        while (textFromFileThroughScanner.hasNextLine()){

            nextLine = textFromFileThroughScanner.nextLine();

            split = nextLine.split("[ ]*");



        }

        System.out.println("Linia: " + nextLine);
        //System.out.println("Ilość: " + length);

    }



}
