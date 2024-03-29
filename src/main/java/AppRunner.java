import Calculations.CalculationFacade;
import Replacement.ReplacementFacade;
import Survey.SurveyFacade;
import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException {

        System.out.println("* * * Text-Statistics * * *");

        CalculationFacade calculationFacade = new CalculationFacade();
        ReplacementFacade replacementFacade = new ReplacementFacade();
        SurveyFacade surveyFacade = new SurveyFacade();

        calculationFacade.getTotalWordsNumber();
        calculationFacade.getNumberOfCharactersWithSpaces();
        calculationFacade.getNumberOfCharactersWithoutSpaces();
        calculationFacade.getLinesOfTextAll();
        calculationFacade.getLinesOfTextFull();
        calculationFacade.getLinesOfTextEmpty();
        calculationFacade.getNumberOfVowels();
        calculationFacade.getNumberOfConsonants();
        calculationFacade.getNumberOfSpecialSigns();
        calculationFacade.getNumberOfCapitalLetters();
        calculationFacade.getNumberOfSmallLetters();
        calculationFacade.getIndividualCharactersOfText();
        calculationFacade.getReport();

        //* * * Additional String challenge type methods * * *

        //calculationFacade.getOriginalTextMappedToLines();
        //replacementFacade.getFindCharactersReplaceCharacters('h', '#', 'k', '$');
        //surveyFacade.getSearchWord("to");

    }

}
