package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Locale;

public class Words {

   public ArrayList<String> readFile() {
       File file = null;
       ArrayList<String> wordsList = null;
       try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                wordsList.add(line);
                if (!line.contains(" ")) {
                    wordsList.add(line.trim().toLowerCase(Locale.ROOT));
                }
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);
        }

        return wordsList;
    }
}

