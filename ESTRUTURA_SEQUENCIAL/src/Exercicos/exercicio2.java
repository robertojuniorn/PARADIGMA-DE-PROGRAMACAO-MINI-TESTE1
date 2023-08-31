package Exercicos;

import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		
		
        double pi = 3.14159;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor do raio do círculo: ");
        double raio = scan.nextDouble();
        
        double area = pi * raio * raio;
        
        System.out.printf("A área do círculo é %.4f%n", area);
        
        scan.close();

	}

}
