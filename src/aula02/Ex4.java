package aula02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) throws Exception {
        double montante, juro, tempo;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o montante inicial: ");
		montante = sc.nextDouble();
        System.out.print("Insira a taxa de juro (%): ");
		juro = sc.nextDouble();
        System.out.print("Insira o tempo (meses): ");
		tempo = sc.nextDouble();

		for(int i=1; i<=tempo; i++){
            montante += montante*(juro/100);

        }

		System.out.println("O montante final é " + montante);
		sc.close();
    }
}
