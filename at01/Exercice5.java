package rivesal.at01;

import java.util.Scanner;

public class Exercice5 {

     public static void main(String[] args) {
        int prix;
        double rabais;
        double prixfinale;

        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Entrez Le montant final avant rabais: ");
        prix = lectureClavier.nextInt();

        rabais = (prix)*0.25;
        prixfinale = (prix - rabais);
        System.out.println("Le prix total avec le rabais est: "  + prixfinale);

        lectureClavier.close();
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }    
}
