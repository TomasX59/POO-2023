package aula06;

import java.util.Scanner;

import aula05.DateYMD;

public class Pessoa {
    protected String name;
    protected int cc;
    protected DateYMD DataNasc;
    static Scanner input = new Scanner(System.in);
    
    public Pessoa(String name, int cc, DateYMD DataNasc){
        this.name = name;
        this.cc = cc;
        this.DataNasc = new DateYMD(DataNasc.getDay(), DataNasc.getMonth(), DataNasc.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public DateYMD getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(DateYMD dataNasc) {
        DataNasc = dataNasc;
    }

    public static boolean isValidName(String str) {
        String pattern = "^[a-zA-Z]+$"; // Regular expression to match alphabets only
        return str.matches(pattern); // Check if the string matches the pattern
    }
    
    public static String askName() {
        String name;
        System.out.println("Input a name: ");
        name = input.nextLine();
        while(!isValidName(name)){ 
        System.out.println("Invalid name. Try again: ");
        name = input.nextLine();
        }
        return name;
    }

    public static int askCC() {
        String cc;
        System.out.println("Input a credit card number: ");
        cc = input.nextLine();
       
        while(!isValidCreditCard(cc)){ // Check if the string matches the pattern
            System.out.println("Invalid credit card number. Try again: ");
            cc = input.nextLine();
        }
        return Integer.parseInt(cc); // convert string to int
    }
    
    public static boolean isValidCreditCard(String cc) {
        cc = cc.replaceAll("\\D+", ""); // Remove all non-digit characters from the credit card number
        int sum = 0;
        boolean alternate = false;
        for (int i = cc.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(cc.substring(i, i + 1));
            if (alternate) {
                digit *= 2;
                if (digit > 9) {
                    digit = (digit % 10) + 1;
                }
            }
            sum += digit;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
    

    public static void main(String args[]){

        DateYMD d = new DateYMD(5, 10, 1988); 
        Pessoa p = new Pessoa("Ana Santos", 98012244, d);

        Pessoa pop = new Pessoa(askName(), askCC(), d);

    }

    @Override
    public String toString() {
        return "Pessoa [Nome = " + name + ", cc=" + cc + ", DataNasc=" + DataNasc + "]";
    }



}
