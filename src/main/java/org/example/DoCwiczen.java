package org.example;

public class DoCwiczen {

    public static void main(String[] args) {

        int x = 0;

        for (int i = 1; i < 5; i++) {

            //System.out.print(i + ", ");

            x = x + i;
            System.out.print(x + ", ");

        }

        System.out.println("\nX: " + x);

        //-------------------------------------------------------

        Integer [] tablica = new Integer[5];

        int y = 0;

        for (int i = 0; i < tablica.length; i++) {

            tablica[i] = i;
            //System.out.print(tablica[i] + ", ");
            y = y + tablica[i];

        }

        System.out.println("Y: " + y);




    }


}