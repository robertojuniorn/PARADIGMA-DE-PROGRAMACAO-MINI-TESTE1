package Exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();
        
        if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é positivo.");
        }
        
        scan.close();
	}

}
