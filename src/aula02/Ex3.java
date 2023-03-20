package aula02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        double waltuh, finalt, initialt, energy;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a massa da água (Kg): ");
		waltuh = sc.nextDouble();
        System.out.print("Insira a temperatura inicial da água (ºC): ");
		initialt = sc.nextDouble();
        System.out.print("Insira a temperatura final da água (ºC): ");
		finalt = sc.nextDouble();

		energy = waltuh * (finalt - initialt);
		System.out.println("Energy (J): " + energy);
		sc.close();
    
    }
}
