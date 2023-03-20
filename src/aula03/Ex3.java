package aula03;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex3 {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // choose random number
        int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        boolean gameRunning = true;
        int attempts = 0;
        while (gameRunning) {
            System.out.print("Adivinhe o número: ");
            int guess = input.nextInt();
            attempts++;
            if (guess > randomNum) {
                System.out.println("Errado, muito alto!");
            } else if (guess < randomNum) {
                System.out.println("Errado, muito baixo!");
            } else {
                System.out.printf("Igual! %d tentativas usadas\n", attempts);
                System.out.println("Reiniciar? Prima (S)im");
                String keepGoing = input.next();
                if (keepGoing.equals("S") || keepGoing.equals("Sim")) {
                    randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
                    attempts = 0;
                } else {
                    gameRunning = false;
                }
            }
        }
    }
}
