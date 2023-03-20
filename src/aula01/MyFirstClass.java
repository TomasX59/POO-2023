package aula01;
import java.util.Scanner;

public class MyFirstClass {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello VS Code");

        System.out.println("What do you wish to print?");
        String cont = sc.nextLine();

        System.out.println("How many times?");
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            System.out.println(cont);
        }
        sc.close();

    }
    
}
