package Report;

import Calculations.CalculationFacade;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Report {

    protected void createsTextStatisticsReport() throws IOException {

        File newFile = new File("src/main/resources/Text-Statistics-Report.txt");

        if (!newFile.exists()){

            newFile.createNewFile();

        }

        PrintWriter printWriter = new PrintWriter("src/main/resources/Text-Statistics-Report.txt");

        CalculationFacade calculationFacade = new CalculationFacade();

        printWriter.print("* * * Text-Statistics-Report (.txt) * * *");

        printWriter.println("\n\nWords: " + calculationFacade.getTotalWordsNumber());
        printWriter.println("Characters (with spaces): " + calculationFacade.getNumberOfCharactersWithSpaces());
        printWriter.println("Characters (without spaces): " + calculationFacade.getNumberOfCharactersWithoutSpaces());
        printWriter.println("Rows (all): " + calculationFacade.getLinesOfTextAll());
        printWriter.println("Rows (with text): " + calculationFacade.getLinesOfTextFull());
        printWriter.println("Rows (empty): " + calculationFacade.getLinesOfTextEmpty());;
        printWriter.println("Vowels: " + calculationFacade.getNumberOfVowels());
        printWriter.println("Consonants: " + calculationFacade.getNumberOfConsonants());
        printWriter.println("Special signs: " + calculationFacade.getNumberOfSpecialSigns());
        printWriter.println("Uppercase letters: " + calculationFacade.getNumberOfCapitalLetters());
        printWriter.println("Lowercase letters: " + calculationFacade.getNumberOfSmallLetters());
        printWriter.println("\nCharacters individually: " + calculationFacade.getIndividualCharactersOfText());

        printWriter.close();

    }

}
