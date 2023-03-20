package aula02;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) throws Exception {
        int n, c;
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Insira o valor inicial :");
		n = sc.nextInt();
        c = n;
        System.out.println();
        while(c>=0){
            
            if (c == n){
                System.out.print(c);
            }else{
                System.out.print(","+ c);
            }

            c--;
        }

		sc.close();
    }
    
}
