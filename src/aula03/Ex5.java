package aula03;

import java.util.Scanner;

public class Ex5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int month, year, day;
        
        do{
            System.out.println("Insira a data no formato mês/ano (mm/yyyy)");
            String userInput = sc.next(); 
            String[] splitInput = userInput.split("/");
            month = Integer.parseInt(splitInput[0]);
            year = Integer.parseInt(splitInput[1]);
            System.out.println();
            System.out.println("Em que dia da semana esse mês começa? ");
            System.out.println("1 - Segunda ");
            System.out.println("2 - Terça ");
            System.out.println("3 - Quarta ");
            System.out.println("4 - Quinta ");
            System.out.println("5 - Sexta ");
            System.out.println("6 - Sábado ");
            System.out.println("7 - Domingo ");
            day = sc.nextInt();

        }while(monthVal(year, month, day)== false); 
        
        printResults(year, month, day);
        
        sc.close();
    }

    public static int daysInMonth(int ano, int mes) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (leapYear(ano)) {
            days[1] = 29;
        }
        return days[mes - 1];
    }

    private static boolean leapYear(int ano) {
        return ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)));
    }

    public static boolean monthVal(int year, int month, int dia){
        if (month < 1 || month > 12){
            System.out.println("Mês inválido! Tente novamente.");
            return false;
        }else if(dia < 0 || dia > 7){
            System.out.println("Dia inválido! Insira um valor entre 1 e 7.");
            return false;
        }else if(year < 0){
            System.out.println("???????????");
            return false;
        }else{
            return true;
        }
    }
    
    public static void printResults(int ano, int mes, int dia) {
        String[] meses = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int[] spaces = { 3, 6, 9, 12, 15, 18, 0 };
        String titulo = meses[mes - 1] + " " + ano;
        System.out.printf("%n%s%s", " ".repeat((20 - titulo.length()) / 2), titulo); // center string
        System.out.println();//
        System.out.print("Su Mo Tu We Th Fr Sa");
        System.out.println();//
        System.out.print(" ".repeat(spaces[dia - 1])); // spacing

        for (int i = 1; i <= daysInMonth(ano, mes); i++) { // print days, print %n when saturday
            System.out.printf("%2d ", i);
            dia++;
            if (dia == 7 || dia == 14) {
                System.out.println("");
                dia = 0;
            }
        }
    }
}
