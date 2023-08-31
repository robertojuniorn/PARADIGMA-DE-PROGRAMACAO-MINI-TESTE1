package Exercicos;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int A = scan.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int B = scan.nextInt();
        
        System.out.print("Digite o valor de C: ");
        int C = scan.nextInt();
        
        System.out.print("Digite o valor de D: ");
        int D = scan.nextInt();
        
        int diferenca = (A * B) - (C * D);
        
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
        
        scan.close();

	}

}
