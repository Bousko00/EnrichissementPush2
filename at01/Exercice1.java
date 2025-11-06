package rivesal.at01;

import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        int nb1;
        int nb2;

        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        nb1 = lectureClavier.nextInt();

        System.out.print("Entrez le deuxième nombre : ");
        nb2 = lectureClavier.nextInt();

        if (nb1>nb2) 
        {
            System.out.println("Le plus grand nombre est : " + nb1);
        } else if (nb2 > nb1) 
        {
            System.out.println("Le plus grand nombre est : " + nb2);
        } else 
        {
            System.out.println("Les deux nombres sont égaux.");
        }

         lectureClavier.close();
        
        
        
}
        
    }


