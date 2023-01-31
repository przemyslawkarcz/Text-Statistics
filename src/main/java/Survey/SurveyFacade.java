package Survey;

import java.io.FileNotFoundException;

public class SurveyFacade {

    public void getSearchWord(String wordToFind) throws FileNotFoundException {

        Search search = new Search();
        search.searchWordsInText(wordToFind);

    }

}
