package rivesal.at02;

import java.util.Scanner;

public class Exercice9 {
     public static void main(String[] args) {

     double circonference;
     int rayon;



     Scanner lectureClavier = new Scanner(System.in);

      System.out.print("Entrez le rayon: ");
	  rayon = lectureClavier.nextInt();

      circonference = 2 * Math.PI * rayon;

      System.out.println("La circonférence est : " + circonference);



       lectureClavier.close();



   
   
   
    
   
    }

}
