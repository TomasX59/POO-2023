package aula05;

import java.util.Scanner;

//Nota: Não usar 0 à esquerda!
public class Ex1Testes {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        DateYMD date = new DateYMD(0, 0, 0);
        int dia=0; int mes=0; int ano=0; //Inicialização das variáveis para evitar erros
        

        int op = 5; //Número diferente de 0 && não atribuido a nenhuma opção
        while(op != 0){
            printMenu();
            op = sc.nextInt();
           
            switch (op) {
                case 1:
                    date.createDate(dia, mes, ano);
                    
                    if(!date.valid(dia,mes,ano)){
                        System.out.println("Invalid date");
                        System.out.println("Try again");
                        date.createDate(dia, mes, ano);
                    }
                    
                    break;
                case 2:
                    System.out.println(date);
                    break;
                case 3:
                    date.increment();
                    break;
                case 4:
                    date.decrement();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }


        sc.close();
    }

    public static void printMenu() {
        System.out.println();
        System.out.println("Date operations");
        System.out.println("1 - create new date");
        System.out.println("2 - show current date");
        System.out.println("3 - increment date");
        System.out.println("4 - decrement date");
        System.out.println("0 - exit");
        System.out.println();
    }


    
}
