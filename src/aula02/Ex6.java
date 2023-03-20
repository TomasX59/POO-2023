package aula02;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) throws Exception {
        int ts, hh, mm, ss;
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira tempo em segundos: ");
		ts = sc.nextInt();

        
        hh = ts/3600;
        mm = hh%60;
        ss = ts%60;
		System.out.println(hh+"h:"+mm+"min:"+ss+"seg");
		sc.close();
    }
}
