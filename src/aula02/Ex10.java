package aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valor;
        double primeiroValor = 0;
        double soma = 0;
        int contador = 0;
        boolean check = true;

        System.out.println();
        System.out.println("(Para terminar a contagem insira o primeiro numero enviado, este ultimo nao afetara a contagem,soma,minimo,maximo ou media)");
        System.out.print("Digite um número real: ");
        while(check){
            try {
                primeiroValor = sc.nextDouble();
                check = false;

            } catch (Exception e) {
                System.out.println("INSIRA UM NUMERO REAL!");
                System.out.print("Digite um número real: ");
                sc.nextLine();
            }
        }
        
        valor = primeiroValor;
        double maximo = valor ;
        double minimo = valor;
        do{
            soma += valor;
            contador++;
            if (valor > maximo) {
                maximo = valor;
            }
            if (valor < minimo) {
                minimo = valor;
            }
            check = true;
            System.out.print("Digite outro número real: ");

            while(check){
                try {
                    valor = sc.nextDouble();
                    check = false;
    
                } catch (Exception e) {
                    System.out.println("INSIRA UM NUMERO REAL!");
                    System.out.print("Digite outro número real: ");
                    sc.nextLine();
                }
            }
        }while (valor != primeiroValor);
        
        if (contador == 0) {
            System.out.println("Nenhum número foi digitado.");
        }
            double media = soma / contador;
            System.out.println("Valor máximo: " + maximo);
            System.out.println("Valor mínimo: " + minimo);
            System.out.println("Média: " + media);
            System.out.println("Total de números lidos: " + contador);
            
            sc.close();
    }
}
