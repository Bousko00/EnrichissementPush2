package rivesal.jour3;

import java.util.Random;

public class Exercice3 {
     public static void main(String[] args) {
        int taille = 10;
        int[] tableau1 = new int[taille];
        int[] tableau2 = new int[taille];

        Random generateur = new Random();

        
        for (int i = 0; i < taille; i++) {
            tableau1[i] = generateur.nextInt(100) + 1;
        }

        // Inverser les éléments dans tableau2
        for (int i = 0; i < taille; i++) {
            tableau2[i] = tableau1[taille - 1 - i];
        }

        
        System.out.println("Tableau original :");
        for (int val : tableau1) {
            System.out.print(val + " ");
        }

        System.out.println("\nTableau inversé :");
        for (int val : tableau2) {
            System.out.print(val + " ");
        }
    }

}
