package rivesal.at02;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
		
	  Scanner lectureClavier = new Scanner(System.in);

      System.out.print("Entrez un mot ou une phrase  : ");
      String phrase = lectureClavier.nextLine();

      String Maj = phrase.toUpperCase();

      System.out.print("Le texte en majuscule est  : " + Maj);

      lectureClavier.close();
    
    
    
    
    
    
    }

}
