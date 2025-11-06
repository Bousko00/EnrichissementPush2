package rivesal.jour3;

public class Exercice1 {
    public static void main(String[] args) {
         String[] mots = new String[5];

          mots[0] = "1";
          mots[1] = "2";
          mots[2] = "3";
          mots[3] = "4";
          mots[4] = "5";



           System.out.println("les éléments du tableau du tableau :");
           for (int i = 0; i < mots.length; i++) {
            System.out.println("Case " + i + " : " + mots[i]);
           }

           System.out.println("\n le tableau sur une ligne :");
           for (String mot : mots) {
            System.out.print(mot + " ");
           }

    
    
    
    
    
    
    
    }

}
