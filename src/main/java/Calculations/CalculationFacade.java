package Calculations;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class CalculationFacade {

    public void getIndividualCharactersOfText() throws FileNotFoundException {

        Characters characters = new Characters();
        Map<Character, Integer> characterIntegerMap = characters.countsIndividualCharactersOfText();

        System.out.println("\nCharacters individually: ");
        System.out.println("C-character : A-amount");
        System.out.println("C:A");
        for (Map.Entry<Character, Integer> map:characterIntegerMap.entrySet()) {

            Character key = map.getKey();
            Integer value = map.getValue();

            System.out.println(key + ":" + value);

        }

    }

    public void getNumberOfCharactersWithSpaces() throws FileNotFoundException {

        Characters characters = new Characters();

        Integer totalNumberOfCharacters = characters.countsNumberOfCharactersWithSpaces();

        System.out.println("Characters (with spaces): " + totalNumberOfCharacters);

    }

    public void getNumberOfCharactersWithoutSpaces() throws FileNotFoundException {

        Characters characters = new Characters();
        Integer numberOfCharactersWithoutSpaces = characters.countsNumberOfCharactersWithoutSpaces();

        System.out.println("Characters (without spaces): " + numberOfCharactersWithoutSpaces);

    }

    public void getLinesOfTextAll() throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextAll = lines.countsLinesOfTextAll();

        System.out.println("Rows (all): " + linesOfTextAll);

    }

    public void getLinesOfTextFull() throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextFull = lines.countsLinesOfTextFull();

        System.out.println("Rows (with text): " + linesOfTextFull);

    }

    public void getLinesOfTextEmpty() throws FileNotFoundException {

        Lines lines = new Lines();
        Integer linesOfTextEmpty = lines.countsLinesOfTextEmpty();

        System.out.println("Rows (empty): " + linesOfTextEmpty);

    }

    public void getOriginalTextMappedToLines() throws FileNotFoundException {

        System.out.print("\n* * * Original text mapped to lines * * *");
        Lines lines = new Lines();
        lines.displaysOriginalTextMappedToLines();

    }

    public void getTotalWordsNumber() throws FileNotFoundException {

        Words words = new Words();
        Integer totalWordsNumber = words.countsTotalWordsNumber();

        System.out.println("\nWords: " + totalWordsNumber);

    }

    public void getNumberOfVowels() throws FileNotFoundException {

        Vowels vowels = new Vowels();
        Integer numberOfVowels = vowels.countsNumberOfVowels();

        System.out.println("Vowels: " + numberOfVowels);

    }

    public void getNumberOfConsonants() throws FileNotFoundException {

        Consonants consonants = new Consonants();
        Integer numberOfConsonants = consonants.countsNumberOfConsonants();

        System.out.println("Consonants: " + numberOfConsonants);

    }

    public void getNumberOfSpecialSigns() throws FileNotFoundException {

        SpecialSigns specialSigns = new SpecialSigns();
        Integer numberOfSpecialSigns = specialSigns.countsNumberOfSpecialSigns();

        System.out.println("Special signs: " + numberOfSpecialSigns);

    }

    public void getNumberOfCapitalLetters() throws FileNotFoundException {

        CapitalLetters capitalLetters = new CapitalLetters();
        Integer numberOfCapitalLetters = capitalLetters.countsNumberOfCapitalLetters();

        System.out.println("Uppercase letters: " + numberOfCapitalLetters);

    }

    public void getNumberOfSmallLetters() throws FileNotFoundException {

        SmallLetters smallLetters = new SmallLetters();
        Integer numberOfSmallLetters = smallLetters.countsNumberOfSmallLetters();

        System.out.println("Lowercase letters: " + numberOfSmallLetters);

    }

    public void getReport() throws IOException {

        ReportFinal reportFinal = new ReportFinal();
        reportFinal.createsTextStatisticsReport();

    }

}
