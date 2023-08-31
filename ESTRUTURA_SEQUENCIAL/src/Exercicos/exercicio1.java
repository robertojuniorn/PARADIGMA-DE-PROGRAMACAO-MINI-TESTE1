package Exercicos;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
	        System.out.print("Digite o primeiro valor inteiro: ");
	        int num1 = scan.nextInt();
	        
	        System.out.print("Digite o segundo valor inteiro: ");
	        int num2 = scan.nextInt();
	        
	        
	        int soma = num1 + num2;
	        
	        System.out.println("A soma de " + num1 + " e " + num2 + "é igual a " + soma );

	}

}
