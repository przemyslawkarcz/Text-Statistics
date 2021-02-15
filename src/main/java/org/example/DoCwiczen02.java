package org.example;

public class DoCwiczen02 {

    public static void main(String[] args) {

        String [] tablicaString = new String[]{"c", "b", "a"};

        for (int i = 0; i < tablicaString.length; i++) {

            char[] charArray = tablicaString[i].toCharArray();

            boolean contains = tablicaString[i].contains("c");

            char charAt = tablicaString[i].charAt(0);

            int compareTo = tablicaString[i].compareTo("b");

            boolean equals = tablicaString.equals(tablicaString);
            boolean equals1 = charArray.equals(charArray);


            //tablica charów
            //System.out.print(charArray);

            //contains
            //System.out.println(" : " + contains);

            //charAt
            //System.out.println(charAt);

            //compareTo
            //System.out.println(compareTo);

            //equals
            System.out.println(equals1);
        }


    }



}
