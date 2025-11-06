package rivesal.at01;

import java.util.Scanner;

public class Exercice2 {

      public static void main(String[] args) {
        
        double salaireHoraire;
        double heuresParSemaine;
        double salaireQuinzaine;
        int semainesParQuinzaine;
        
    

        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Entrez votre salaire horaire : ");
        salaireHoraire = lectureClavier.nextDouble();

        System.out.print("Entrez le nombre d'heures travaillées par semaine : ");
        heuresParSemaine = lectureClavier.nextDouble();

        semainesParQuinzaine = 2;
        salaireQuinzaine = salaireHoraire * heuresParSemaine * semainesParQuinzaine;

        System.out.println("Le salaire pour la quinzaine est de : " + salaireQuinzaine + "");

        lectureClavier.close();

    }

}
