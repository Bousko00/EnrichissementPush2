package rivesal.at01;

import java.util.Scanner;

public class Exercice3 {
     public static void main(String[] args) {
       int age1;
       int age2;
       int moyenne;

       Scanner lectureClavier = new Scanner(System.in);

       System.out.print("Entrez L'age de la première personne : ");
       age1 = lectureClavier.nextInt();

       System.out.print("Entrez l'age de la deuxième personne: ");
       age2 = lectureClavier.nextInt();

       moyenne = (age1+age2)/2;
       System.out.println("La moyenne des 2 ages est "  + moyenne);

       if (age1>age2) 
        {
            System.out.println("L'age de la personne la plus agée est : " + age1);
        } else if (age2 > age1) 
        {
            System.out.println("L'age de la personne la plus agée est : " + age2);
        } else 
        {
            System.out.println("Les deux ages sont égaux sont égaux.");
        }

        
        lectureClavier.close();


     
    
    
    }

}
