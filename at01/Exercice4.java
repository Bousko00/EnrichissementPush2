package rivesal.at01;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {

    int note;


    Scanner lectureClavier = new Scanner(System.in);


    System.out.print("Entrez La note de l'élève en math: ");
    note = lectureClavier.nextInt();

    if (note>59) 
    {
      System.out.println("L'élève a reussi son cours de math : ");  
    }
    else 
    {
      System.out.println("L'élève n'a pas reussi son cours de math : ");  
    }

    lectureClavier.close();


 
 
 
 
 
 
 }


}