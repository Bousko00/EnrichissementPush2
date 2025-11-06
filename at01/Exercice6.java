package rivesal.at01;

import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {
       
        int nb1;
        int nb2;
        int typePlancher;
        double longueurplancher;
        double largeurplancher;
        double AirDuPlancher;
        double PrixPlancher;
        double prixParMetreCarre;


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

        System.out.print("Entrez le nombre qui designe le type de plancher de plancher que vous voulez  (1- Chêne, 2- Érable, 3-Pin) : ");
        typePlancher = lectureClavier.nextInt();

        if (typePlancher == 1) 
        {
            System.out.println(" Vous avez choisi le type de plancher chêne");
            prixParMetreCarre = 5.0;
        }
        else if (typePlancher == 2) 
        {
          System.out.println("Vous avez choisi le type de plancher érable");
          prixParMetreCarre = (12);  
        }
        else if (typePlancher == 3) 
        {
          System.out.println("Vous avez choisi le type de plancher Pin.");
          prixParMetreCarre = (10); 
        }
        else
        {
            System.out.println("Vous n’avez pas choisit le bon type de plancher.");
            lectureClavier.close();
             return;
            
        }
         
        lectureClavier.nextLine();       
        System.out.println("Saisissez votre nom.");
        String nom = lectureClavier.nextLine();

        System.out.println("Entrez la longueur de votre plancher.");
        longueurplancher = lectureClavier.nextInt();

        System.out.println("Saisissez la largeur de votre plancher.");
        largeurplancher = lectureClavier.nextInt();

        AirDuPlancher = longueurplancher * largeurplancher;
        PrixPlancher = AirDuPlancher * prixParMetreCarre;

        System.out.println("Votre nom est : " +  nom + " La surface de votre plancher est : " + AirDuPlancher + " Le prix total pour faire votre plancher est + " + PrixPlancher +"$");

        lectureClavier.close();




    }




}
