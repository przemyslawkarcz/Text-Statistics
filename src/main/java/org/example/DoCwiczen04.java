package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DoCwiczen04 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/resources/Text.txt");
        Scanner scanner = new Scanner(file);
        int counter = 0;

        while (scanner.hasNextLine()) {

            String line01 = scanner.nextLine();

            counter++;

            System.out.println(line01 + " || ");

            while (scanner.hasNextLine()) {

                String line02 = scanner.nextLine();

                System.out.print(line01 + " | ");
                System.out.println(line02 + " | ");

            }

            //System.out.println(counter + ": " + line + " : " + line.length());

            /*char[] charArray = line01.toCharArray();

            for (int i = 0; i < charArray.length; i++) {

                System.out.print(charArray[i] + ", ");

            }*/

        }

        File file02 = new File("src/main/resources/Text.txt");
        Scanner scanner02 = new Scanner(file02);
        int count = 1;

        String [][] tablicaLiniTekstu = new String[4][];

        while (scanner02.hasNextLine()) {
            count++;

            String nextLine = scanner02.nextLine();
            String[] tablicaPojedynczejLiniTekstu = {nextLine};

            for (int i = 0; i < tablicaLiniTekstu.length; i++) {

                tablicaLiniTekstu[i]= tablicaPojedynczejLiniTekstu;

                for (int j = 0; j < tablicaLiniTekstu[i].length; j++) {

                    System.out.println(i + ": " + tablicaLiniTekstu[i][j]);

                }

            }

            //System.out.println(count + ": " + nextLine + " // ");


        }





        /*String text01 = "jakiś tekst";
        String text02 = "jakiś tekst";

        int length01 = text01.length();
        int length02 = text02.length();

        if (length01 == length02) {

            System.out.println("Są równe!");

        } else {

            System.out.println("Sa NIErówne!");

        }*/


    }

}
