package pl.edu.agh.hangman;

import java.util.ArrayList;

public class RandomWord {
    public String randomWord;
    public String randomWord(ArrayList<String> list) {
        int size = list.size();
        int randomInt = (int)(Math.random() * size);
        return list.get(randomInt);
    }
}
