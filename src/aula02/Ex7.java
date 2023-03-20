package aula02;

import java.util.Scanner;
import java.lang.Math;

//import java.lang.Math;
public class Ex7 {
    public static void main(String[] args) throws Exception {
        int x1, x2, y1, y2;
        double d;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as coordenadas do ponto 1 (p1) ");
        System.out.print("x : ");
		x1 = sc.nextInt();
        System.out.print("y : ");
		y1 = sc.nextInt();

        System.out.println("Insira as coordenadas do ponto 2 (p2) ");
        System.out.print("x : ");
		x2 = sc.nextInt();
        System.out.print("y : ");
		y2 = sc.nextInt();

        int xn = Math.abs(x1-x2);
        int yn = Math.abs(y1-y2);
        d = Math.sqrt(xn*xn + yn*yn);
		System.out.println("Distância: " + d);
		sc.close();
    }
}
