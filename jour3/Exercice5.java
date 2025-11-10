package rivesal.jour3;

import java.util.Random;

public class Exercice5 {
    public static void main(String[] args) {
		Random random = new Random(); 
        
        int[] tableau = new int[10];

        
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); 
        }

       
        System.out.println("--- Tableau Random ---");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Numéro " + i + " : " + tableau[i]);
        }

        for (int i = 0; i < tableau.length / 2; i++) {
            int temp = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = temp;
        }

        
        System.out.println("\nTableau après permutation :");
        afficherTableau(tableau);
    }

    
    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Indice " + i + " : " + tableau[i]);
        }
	}

}
