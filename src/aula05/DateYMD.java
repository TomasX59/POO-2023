package aula05;

import java.util.Scanner;

public class DateYMD {
            
    static Scanner sc = new Scanner(System.in);
    private int day, month, year;
    public DateYMD(int dia, int mes, int ano) {
    }

    public static void main(String[] args) {
        sc.close();
    }

    public void createDate(int day, int month, int year){
        
        System.out.println("Introduce a date (DD/MM/AAAA): ");
        System.out.print("Day: "); 
        this.day = sc.nextInt();

        System.out.print("Month: ");
        this.month = sc.nextInt();

        System.out.print("Year: ");
        this.year = sc.nextInt();
    
    }

    public void increment() {
        day++;
        if (day > monthDays(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }

    public void decrement() {
        day--;
        if (day < 1) {
            month--;
            if (month < 1) {
                month = 12;
                year--;
            }
            day = monthDays(month, year);
        }
    }

    @Override
    public String toString() {
        return "DateYMD (AAAA/MM/DD) ["+ year + "/" + month + "/" + day + "]";
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public static boolean validMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static int monthDays(int month, int year) {
        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (leapYear(year)){
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        return days;
    }

    public static boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean valid(int day, int month, int year) {
        return validMonth(month) && day >= 1 && day <= monthDays(month, year);
    }

}

