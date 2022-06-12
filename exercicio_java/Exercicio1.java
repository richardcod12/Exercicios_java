package exercicio_java;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float prato, sobremesa, bebida, caloria, totalcalorias;
		
		System.out.println("Digite um prato por favor:"
				+"\nPrato1-vegetariano"
				+"\nPrato2-frango"
				+"\nPrato3-peixe"
				+"\nPrato4-carne");
		 prato = sc.nextFloat();
		 
		 if(prato==1) {
			 caloria = 180;
			 
		 }else if(prato==2) {
			 caloria = 230;
			 
		 }else if(prato==3) {
			 caloria = 250;
			 
		 }else if(prato==4) {
			 caloria = 350;
		 }
		 
		 System.out.println("Digite uma sobremesa por favor:"
					+"\nSobremesa1-Abacaxi"
					+"\nSobremesa2-Sorvete diet"
					+"\nSobremesa3-Mouse diet"
					+"\nSobremesa4-Mouse chocolate");
		 sobremesa = sc.nextFloat();
		 
		 if(sobremesa==1) {
			 caloria = 75;
			 
		 }else if(sobremesa==2) {
			 caloria = 110;
			 
		 }else if(sobremesa==3) {
			 caloria = 170;
			 
		 }else if(sobremesa==4) {
			 caloria = 200;
		 }
		
		 System.out.println("Digite uma bebida por favor:"
					+"\nBebida1-Chá"
					+"\nBebida2-Suco de laranja"
					+"\nBebida3-Suco de melão"
					+"\nBebida4-Refrigerante diet");
		 bebida = sc.nextFloat();
		 
		 if(bebida==1) {
			 caloria = 20;
			 
		 }else if(bebida==2) {
			 caloria = 70;
			 
		 }else if(bebida==3) {
			 caloria = 100;
			 
		 }else if(bebida==4) {
			 caloria = 65;
		 }
		 
		 totalcalorias =prato+sobremesa+bebida;
		 
		 System.out.println("O total de calorias é: " + totalcalorias);
		
		
	}
	
	}


