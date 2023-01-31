package Replacement;

import java.io.FileNotFoundException;

public class ReplacementFacade {

    public void getFindCharactersReplaceCharacters(char charToFind_1, char signToBeChangedToTheLeft,
                                                   char charToFind_2, char signToBeChangedToTheRight) throws FileNotFoundException {

        Swap swap = new Swap();
        swap.findCharactersReplaceCharactersNextToSearchedOne(charToFind_1, signToBeChangedToTheLeft, charToFind_2, signToBeChangedToTheRight);

    }

}
