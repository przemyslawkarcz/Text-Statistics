package org.example;

import java.io.FileNotFoundException;

public class AppRunner_Characters_Replacement {

    /*

    This is an execution class for character search and replace method

    */

    public static void main(String[] args) throws FileNotFoundException {

        Replace replace = new Replace();

        //use this method to find a chosen characters in the text and to replace other characters in the text
        //see details in Replace.class where full description of the method 'findCharactersReplaceCharacters' exists
        replace.findCharactersReplaceCharacters('h', '#', 'k', '$');


    }



}
