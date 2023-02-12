package pl.edu.agh.hangman;


import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class Words {

    private String fileName = "src/main/resources/slowa.txt";

    public ArrayList<String> readFile() {
        ArrayList<String> wordsList = new ArrayList<>();
        File file = new File(fileName);
        try (BufferedReader reader = Files.newBufferedReader(file.toPath())) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                wordsList.add(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s", x);
        }
        return wordsList;
    }

}
