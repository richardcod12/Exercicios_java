package exercicio_java;

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double real, dolar, cotacao;

        System.out.println("Digite uma quantidade em dolar: " );
        dolar = sc.nextDouble();

        System.out.println("Digite a cota��o do dolar: " );
        cotacao = sc.nextDouble();

        real = dolar * cotacao;

        System.out.printf("Voc� possui em reais: " + real);
    }

}
