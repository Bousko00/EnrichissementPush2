package rivesal.jour3;



public class Exercice6 {
    
    public static void main(String[] args) {
        int[] tableauA = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};
        int sommePos = 0;
        int sommeNeg = 0;

        for (int i = 0; i < tableauA.length; i++) {
            if (tableauA[i] >= 0) {
                sommePos += tableauA[i];
            } else {
                sommeNeg += tableauA[i];
            }
        }

        System.out.println("A. Tableau fixe :");
        System.out.println("Somme des éléments positifs : " + sommePos);
        System.out.println("Somme des éléments négatifs : " + sommeNeg);
    }

}
