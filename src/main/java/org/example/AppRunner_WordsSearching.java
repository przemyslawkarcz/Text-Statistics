package org.example;

import java.io.FileNotFoundException;

public class AppRunner_WordsSearching {

    /*

    This is an execution class for text-to-word search methods only

    */

    public static void main(String[] args) throws FileNotFoundException {

        Search search = new Search();

        //use this method to find a chosen word in text
        search.searchWordsInText("to");

    }

}
