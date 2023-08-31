package Exercicos;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
        double pi = 3.14159;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        double A = scan.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double B = scan.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double C = scan.nextDouble();
        
        double areaTriangulo = (A * C) / 2.0;
        System.out.println("Área do triângulo: " + areaTriangulo);
        
        double areaCirculo = pi * Math.pow(C, 2);
        System.out.println("Área do círculo: " + areaCirculo);
        
        double areaTrapezio = ((A + B) * C) / 2.0;
        System.out.println("Área do trapézio: " + areaTrapezio);
        
        double areaQuadrado = Math.pow(B, 2);
        System.out.println("Área do quadrado: " + areaQuadrado);
        
        double areaRetangulo = A * B;
        System.out.println("Área do retângulo: " + areaRetangulo);
        
        scan.close();

	}

}
