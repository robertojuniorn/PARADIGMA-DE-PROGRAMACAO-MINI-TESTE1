package Exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da renda (MT): ");
        double renda = scan.nextDouble();
        
        double imposto = 0.0;

        if (renda <= 2000.00) {
            imposto = 0.00;
        } else if (renda <= 3000.00) {
            imposto = renda * 0.08;
        } else if (renda <= 4500.00) {
            imposto = renda * 0.18;
        } else {
            imposto = renda * 0.28;
        }

        System.out.printf("O valor do imposto a pagar é de %.2f MZN.%n", imposto);

        scan.close();

	}

}
