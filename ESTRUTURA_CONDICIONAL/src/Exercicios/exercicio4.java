package Exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a hora inicial do jogo: ");
        int horaInicial = scan.nextInt();
        
        System.out.print("Digite a hora final do jogo: ");
        int horaFinal = scan.nextInt();
        
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        
        System.out.println("A duração do jogo é de " + duracao + " horas.");
        
        scan.close();

	}

}
