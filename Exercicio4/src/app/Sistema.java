package app;

import java.util.Scanner;

import entities.Conversor;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a cotação do dolar? ");
		Conversor.setDolar(sc.nextDouble());
		System.out.println("Quantos dolar pretende comprar? ");
		double dolar = sc.nextDouble();
		System.out.println("Valor a ser pago em reais = " + Conversor.compraDolar(dolar));
		
		sc.close();
	}
}
