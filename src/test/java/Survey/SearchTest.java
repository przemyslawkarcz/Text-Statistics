package Survey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {

    @Test
    public void searchWordsInTextTest01(){

        String exemplaryText = "sample text generated for the word lookup method test";

        String textToFind = "text";

        String found_first_part = "Word";
        String found_second_part = " found";
        String concat = "";

        String[] split = exemplaryText.split("[ ]");

        for (int i = 0; i < split.length; i++) {

            if (split[i].equalsIgnoreCase(textToFind)){

                concat = found_first_part.concat(found_second_part).concat("!");

            }

        }

        Assertions.assertEquals("Word found!", concat);

    }

    @Test
    public void searchWordsInTextTest02(){

        String exemplaryText = "some other text generated for the word lookup method test";

        String textToFind = "other";

        String found_first_part = "Word has";
        String found_second_part = " been found";
        String concat = "";

        String[] split = exemplaryText.split("[ ]");

        for (int i = 0; i < split.length; i++) {

            if (split[i].equalsIgnoreCase(textToFind)){

                concat = found_first_part.concat(found_second_part).concat("!");

            }

        }

        Assertions.assertNotEquals("Word has been found", concat);

    }

}
