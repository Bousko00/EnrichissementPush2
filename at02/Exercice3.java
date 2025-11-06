package rivesal.at02;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
 
        int compteur = 0;
        
        Scanner lectureClavier = new Scanner(System.in);

        System.out.print("Entrez un mot ou une phrase  : ");
        String phrase = lectureClavier.nextLine();

        

        for(int i = 0; i < phrase.length(); i++)
        if (phrase.charAt(i) == 'a') 
        {
            compteur++;
        }
          
        String phraseFinal = phrase.replace('a', '$');

        String Maj = phraseFinal.toUpperCase();

        System.out.print("La phrase final est   : " + Maj);



        
        lectureClavier.close();
	
    
    
    
    
    
    
    }

}
