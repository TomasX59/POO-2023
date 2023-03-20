package aula02;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) throws Exception {
        double c1, c2, h;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os valores dos catetos ");
        
        System.out.print("Cateto 1: ");
		c1 = sc.nextDouble();
        if (c1 <= 0){
            System.out.println("ERRO! Valor inválido");
        }
        
        System.out.print("Cateto 2: ");
		c2 = sc.nextDouble();
        if (c1 <= 0){
            System.out.println("ERRO! Valor inválido");
        }
        
        h = Math.sqrt(c1*c1+c2*c2);
		System.out.println("Hipotenusa: " + h);
		sc.close();
    }
}
