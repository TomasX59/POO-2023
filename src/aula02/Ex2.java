package aula02;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws Exception {
        double celsius, farhe;
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira temperatura(ºC): ");
		celsius = sc.nextDouble();
		farhe = celsius*1.8 + 32;
		System.out.println("Temperatura (ºF): " + farhe);
		sc.close();
    
    }
}
