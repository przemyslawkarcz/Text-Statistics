package Calculations;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReportFinal {

    protected void createsTextStatisticsReport() throws IOException {

        File newFile = new File("src/main/resources/Text-Statistics-Report.txt");

        if (!newFile.exists()){

            newFile.createNewFile();

        }

        PrintWriter printWriter = new PrintWriter("src/main/resources/Text-Statistics-Report.txt");

        CapitalLetters capitalLetters = new CapitalLetters();
        Characters characters = new Characters();
        Consonants consonants = new Consonants();
        Lines lines = new Lines();
        SmallLetters smallLetters = new SmallLetters();
        SpecialSigns specialSigns = new SpecialSigns();
        Vowels vowels = new Vowels();
        Words words = new Words();

        printWriter.print("* * * Text-Statistics-Report (.txt) * * *");

        printWriter.println("\n\nWords: " + words.countsTotalWordsNumber());
        printWriter.println("Characters (with spaces): " + characters.countsNumberOfCharactersWithSpaces());
        printWriter.println("Characters (without spaces): " + characters.countsNumberOfCharactersWithoutSpaces());
        printWriter.println("Rows (all): " + lines.countsLinesOfTextAll());
        printWriter.println("Rows (with text): " + lines.countsLinesOfTextFull());
        printWriter.println("Rows (empty): " + lines.countsLinesOfTextEmpty());
        printWriter.println("Vowels: " + vowels.countsNumberOfVowels());
        printWriter.println("Consonants: " + consonants.countsNumberOfConsonants());
        printWriter.println("Special signs: " + specialSigns.countsNumberOfSpecialSigns());
        printWriter.println("Uppercase letters: " + capitalLetters.countsNumberOfCapitalLetters());
        printWriter.println("Lowercase letters: " + smallLetters.countsNumberOfSmallLetters());
        printWriter.println("\nCharacters individually: " + characters.countsIndividualCharactersOfText());

        printWriter.close();

    }

}
