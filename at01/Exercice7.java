package rivesal.at01;

public class Exercice7 {
    public static void main(String[] args) {

        int A1 = 3 * 10 + 45 / 5 - 8 + 56 % 20;
        int B1 = 3 * 10 + 45 / 5 - (8 + 56) % 20;
        int C1 = 3 * 10 + 45 / (5 - 8 + 56) % 20;
        int D1 = 3 * 10 + 45 / (5 - 8) + 56 % 20;
        int E1 = 3 * (10 + 45) / 5 - 8 + 56 % 20;
        int F1 = 3 * (10 + 45 / 5) - 8 + 56 % 20;

        System.out.println("Résultats des premières expressions :");
        System.out.println("A = " + A1);
        System.out.println("B = " + B1);
        System.out.println("C = " + C1);
        System.out.println("D = " + D1);
        System.out.println("E = " + E1);
        System.out.println("F = " + F1);


        int A2 = 12 + 3 * 4 / 3;
        double B2 = 3.7 + (8 / 2) * (8 / 2);
        int C2 = 13 + 4 * 2 - 3 * (8 % 3 + 5);
        int D2 = 6 / 2 / 3;
        double E2 = -(5 * 2) * (5 * 2) * 10 + 18 / (4 + 8 / 2 / 2);
        double F2 = 24 + 36 / (6 * 3 / (7 + 2));
        int G2 = 8 + 4 / 2 + 6;
        int H2 = (int)(7.67 + 0.5) - (int)7.67;
        int I2 = (int)(-7.67 + 0.5) - (int)(-7.67);
        int J2 = 3 + 5 * 6 / 3 - 5;
        double K2 = (1.0 / 2);
        double L2 = (1.0 / 2.0);

        System.out.println("Résultats des expressions :");
        System.out.println("A = " + A2);
        System.out.println("B = " + B2);
        System.out.println("C = " + C2);
        System.out.println("D = " + D2);
        System.out.println("E = " + E2);
        System.out.println("F = " + F2);
        System.out.println("G = " + G2);
        System.out.println("H = " + H2);
        System.out.println("I = " + I2);
        System.out.println("J = " + J2);
        System.out.println("K = " + K2);
        System.out.println("K = " + L2);

        int a = 2;
        int b = 3;
        int c = 5;
        int d = 3;

        int y1 = (a * (b + d) - 2) * 3;
        double y2 = Math.sqrt(c - a) * d - 1;
        int y3 = b * (-d + 2) - a * (c + d);

        System.out.println("Expression a: y = " + y1); 
        System.out.println("Expression b: y = " + y2); 
        System.out.println("Expression c: y = " + y3); 

		













	}

}
