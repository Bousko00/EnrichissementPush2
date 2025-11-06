package rivesal.jour3;

import java.util.Scanner;

public class Exercice2 {
     public static void main(String[] args) {
        double[] tableau = new double[10]; // Déclaration du tableau
        Scanner lectureClavier = new Scanner(System.in);

        // Saisie des valeurs
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Entrez un nombre réel  " + i + " : ");
            tableau[i] = lectureClavier.nextDouble();
        }

        // Affichage du tableau
        System.out.println("\n tableau :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Indice " + i + " : " + tableau[i]);
        }

        lectureClavier.close();
    }

}
