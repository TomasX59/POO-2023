package aula02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        double v1, d1, v2, d2, vm;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a velocidade no primeiro trajeto: ");
		v1 = sc.nextDouble();
        System.out.print("Insira a distância no primeiro trajeto: ");
		d1 = sc.nextDouble();
        System.out.print("Insira a velocidade no segundo trajeto: ");
		v2 = sc.nextDouble();
        System.out.print("Insira a distância no segundo trajeto: ");
		d2 = sc.nextDouble();

        vm = (d1+d2)/((d1/v1)+(d2/v2));
		System.out.println("A velocidade média é " + vm);
		sc.close();
    }
}
