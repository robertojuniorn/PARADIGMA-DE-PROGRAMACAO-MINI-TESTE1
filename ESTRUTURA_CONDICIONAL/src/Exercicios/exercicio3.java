package Exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = scan.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = scan.nextInt();
        
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos.");
        } else {
            System.out.println("Nao sao Multiplos.");
        }
        
        scan.close();
    }
}

