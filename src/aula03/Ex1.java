package aula03;

import java.util.Scanner;

public class Ex1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
		
        int n;
        int sum = 0;
        
        n = dataIn();
        while(!valid(n)){
            System.out.println("ERRO! Tente novamente.");
            n = dataIn();
        }

        for(int i=1;i<=n;i++){
            if(isPrimo(i)){
                sum += i;
            }
        }
        
        System.out.printf("Soma = " + sum);

        sc.close();
    }

    public static int dataIn() throws Exception {
        //Scanner sc = new Scanner(System.in); // Dá erro, por isso é iniciado lá fora.
        System.out.printf("Insira um inteiro positivo: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();
        //sc.close(); // MOTIVO DO ERRO -> Uma vez que o scanner seja fechado este não pode voltar a ser aberto!
        
        return n;
    }

    public static boolean isPrimo(int x){
        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                System.out.println(x + " " + "Não é primo!");
                return false;
            }
        }
        if (x == 1){
            System.out.println(x + " " + "Não é primo");
            return false;
        } else {
            System.out.println(x + " " + "É primo!");
            return true;
        }

    }

    public static boolean valid(int x){

        return x>0;
        
        /*
        if(x>0){
            return true;
        }else{
            return false;     
        }
        */
    }
}

