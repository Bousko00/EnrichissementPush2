package rivesal.at02;

import java.util.Scanner;

public class Exercice12 {
     static int sommeMinMax(int minimum, int maximum){
        int somme = 0;
        for(int i = minimum; i <= maximum; i++){
            somme += i;
        }
        return somme;
    }

    public static void main(String[] args) {
        int minimum, maximum;
        Scanner entree = new Scanner(System.in);
        System.out.print("Entrer un minimum : "); minimum = entree.nextInt();
        System.out.print("Entrer un maximum : "); maximum = entree.nextInt();
        System.out.println("Somme de tout : " + sommeMinMax(minimum,maximum));
        entree.close(); 
    }

}
