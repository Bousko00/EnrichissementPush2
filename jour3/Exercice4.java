package rivesal.jour3;

import java.util.Random;

public class Exercice4 {
    public static void main(String[] args) {
		 Random random = new Random(); 
        
        int[] tableau = new int[5];

        
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); 
        }

       
        System.out.println("--- Tableau Random ---");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Numéro " + i + " : " + tableau[i]);
        }

        
        int min = tableau[0];
        int max = tableau[0];
        int positionMin = 0;
        int positionMax = 0;

        
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
                positionMin = i;
            }
            if (tableau[i] > max) {
                max = tableau[i];
                positionMax = i;
            }
        }
        
        System.out.println("--- Résultats ---");
        System.out.println("Plus grand nombre : " + max + " pos " + positionMax );
        System.out.println("Plus petit nombre : " + min + " pos " + positionMin );
	}

}
