package pl.edu.agh.hangman;

import java.util.Locale;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {

        String word = new RandomWord().randomWord();
        WordCharArray wcr = new WordCharArray();
        HangTree ht = new HangTree();
        Scanner sc = new Scanner(System.in);

        char[] wordToGuess = wcr.charsArray(word);
        char[] hiddenWord = wcr.hideCharsArray(wordToGuess);

        System.out.println(word);

        int counter = 0;
        while (true) {
            if (counter == 6) {
                ht.printHangmanStatus(counter);
                System.out.println("GAME OVER, you lose!");
                break;
            }
            if (wcr.checkWin(wordToGuess, hiddenWord)) {
                System.out.println("YOU WIN! YOU GUESTED THE WORD: " + word.toUpperCase(Locale.ROOT) + " CORRECTLY!");
                System.out.println(word);
                break;
            }
            ht.printHangmanStatus(counter);
            wcr.printCharArray(hiddenWord);
            char c = sc.nextLine().charAt(0);
            if (!wcr.guestChar(c, wordToGuess)) {
                counter++;
                continue;
            }
            wcr.checkGuess(c, wordToGuess, hiddenWord);
        }
    }
}
