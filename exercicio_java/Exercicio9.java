package exercicio_java;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int minimo = 1212;

        System.out.println("Digite o valor salarial: ");
        double salario = sc.nextDouble();

        double resultado = salario / minimo;

        System.out.printf("A quantidade de sal�rios minimos s�o: %.0f",  resultado);

        sc.close();
    }

}
