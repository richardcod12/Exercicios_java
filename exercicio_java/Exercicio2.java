package exercicio_java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		
		System.out.println("Digite um numero:");
		n1 = sc.nextInt();
		
		if(n1 % 2== 0 || n1 % 5 == 0 || n1 % 10 == 0) {
			System.out.println("O numero "+n1+" é divisel por 2, 5 ou 10");
			
		}else {
			System.out.println("Esse numero não é divisel por 2, 5 e 10");
		}
		
		

}
}