package org.example;

import java.io.File;
import java.io.IOException;

public class Text {

    public void createsTextFile() throws IOException {

        File newFile = new File("src/main/resources/Text.txt");

        if (!newFile.exists()){

            newFile.createNewFile();

        }

    }

}
