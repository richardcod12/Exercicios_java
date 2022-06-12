package exercicio_java;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		
		System.out.println("Digite o primeiro numero:");
		n1 = sc.nextInt();
		
		System.out.println("Digite o segudo numero:");
		n2 = sc.nextInt();
		
		System.out.println("Digite o terceiro numero:");
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(+n1+ " .. " +n2+ " .. " +n3);
		}else {
			if(n1 < n2) {
				System.out.println(+n1+ " .. " +n2+ " .. " +n3);
			
			}
		}
		
		
	}

}
