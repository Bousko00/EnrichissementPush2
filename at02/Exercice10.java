package rivesal.at02;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
		int nb1;
        int nb2;
        

        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Entrez un nombre: ");
	    nb1 = lectureClavier.nextInt();

        System.out.print("Entrez un deuxieme nombre: ");
	    nb2 = lectureClavier.nextInt();

        int resultat = Math.max(nb1, nb2);

        System.out.print("Le plus grand nombre est: " + resultat);

         lectureClavier.close();
	    




	}

}
