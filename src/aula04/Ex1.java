package aula04;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Circle> circulos = new ArrayList<>();
		ArrayList<Rectangle> retangulos = new ArrayList<>();
		ArrayList<Triangle> triangulos = new ArrayList<>();
		int op;
		do {
			printMenu();
			op = input.nextInt();
			switch (op) {
				case 1:
					createCircle(circulos, input);
					break;
				case 2:
					createTriangle(triangulos, input);
					break;
				case 3:
					createRectangle(retangulos, input);
					break;
				case 4:
					listAllFigures(circulos, retangulos, triangulos);
					break;
				case 5:
					compareAllFigures(circulos, retangulos, triangulos);
					break;
			}
		} while (op != 0);
	}

	public static void printMenu() {
		System.out.println("\n\nOperations");
		System.out.println("1 - create new circle");
		System.out.println("2 - create new triangle");
		System.out.println("3 - create new rectangle");
		System.out.println("4 - list all figures");
		System.out.println("5 - compare all figures");
		System.out.println("0 - exit");
	}

	public static void createCircle(ArrayList<Circle> lst, Scanner input) {
		System.out.print("Radius of circle: ");
		double radius = input.nextDouble();
		lst.add(new Circle(radius));
	}

	public static void createRectangle(ArrayList<Rectangle> lst, Scanner input) {
		System.out.print("Length of rectangle: ");
		double l = input.nextDouble();
		System.out.print("Width of rectangle: ");
		double w = input.nextDouble();
		lst.add(new Rectangle(l, w));
	}

	public static void createTriangle(ArrayList<Triangle> lst, Scanner input) {
		System.out.print("Size of side1: ");
		double side1 = input.nextDouble();
		System.out.print("Size of side2: ");
		double side2 = input.nextDouble();
		System.out.print("Size of side3: ");
		double side3 = input.nextDouble();
		lst.add(new Triangle(side1, side2, side3));
	}

	public static void listAllFigures(ArrayList<Circle> circulos, ArrayList<Rectangle> retangulos,
			ArrayList<Triangle> triangulos) {
		for (Circle c : circulos) {
			System.out.println(c.toString());
		}
		for (Rectangle r : retangulos) {
			System.out.println(r.toString());
		}
		for (Triangle t : triangulos) {
			System.out.println(t.toString());
		}
	}

	public static void compareAllFigures(ArrayList<Circle> circulos, ArrayList<Rectangle> retangulos,
			ArrayList<Triangle> triangulos) {
		if (circulos.size() < 2 || retangulos.size() < 2 || triangulos.size() < 2) {
			System.out.println("Not enough pairs in order to compare all figures.");
			return;
		}
		for (Circle c : circulos) {
			for (Circle c2 : circulos) {
				if (c == c2) {
					continue;
				}
				System.out.println(c.toString() + " equals:" + c.equals(c2) + " " + c2.toString());
			}
		}

		for (Rectangle c : retangulos) {
			for (Rectangle c2 : retangulos) {
				if (c == c2) {
					continue;
				}
				System.out.println(c.toString() + " equals:" + c.equals(c2) + " " + c2.toString());
			}
		}

		for (Triangle c : triangulos) {
			for (Triangle c2 : triangulos) {
				if (c == c2) {
					continue;
				}
				System.out.println(c.toString() + " equals:" + c.equals(c2) + " " + c2.toString());
			}
		}

	}

}
