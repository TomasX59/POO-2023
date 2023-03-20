package aula03;

import java.util.Scanner;

public class Ex2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double mont = montanteInv();
        double taxa = taxa();

        if(!validarMontante(mont)){
            System.out.println("ERRO! Tente novamente.");
            mont = montanteInv();
        }
        
        System.out.println();
        
        if(!validarTaxa(taxa)){
            System.out.println("ERRO! Tente novamente.");
            taxa = taxa();
        }
        
        System.out.println("Montante final: " + montanteFinal(mont, taxa));
        
        sc.close(); 
    }
    
    public static double montanteInv(){
        System.out.printf("Insira o montante investido: ");
        double n = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        return n;
    }

    public static double taxa(){
        System.out.print("Insira a taxa (entre 0% e 5%): ");
        double n = sc.nextDouble();
        sc.nextLine();
        System.out.println();
        return n;
    }

    public static double montanteFinal(double mont, double taxa){
        System.out.print("Insira a quantidade de meses: ");
        int meses = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= meses; i++){
            mont += mont*(taxa/100);
        }

        System.out.println();
        return mont;
        
    }

    public static boolean validarMontante(double x){
        if(((x%1000)==0)&& x>0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean validarTaxa(double x){
        if((0<= x) && (x<=5)){
            return true;
        }else{
            return false;
        }
    }
}
