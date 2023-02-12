package pl.edu.agh.hangman;

import java.util.Scanner;

public class Input {
   public void skanujLitere(){

       Scanner scanner = new Scanner(System.in);

       System.out.println("Podaj litere: ");
       char litera = scanner.next().charAt(0);
       System.out.println();
   }
}
