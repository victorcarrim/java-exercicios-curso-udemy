package app;

import java.util.Scanner;

import entities.ContaBancaria;

public class SistemaBancario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria c1;

		System.out.println("-=-=-=-=-=-=-=-=- Sistema Bancário -=-=-=-=-=-=-=-=-");
		System.out.println("Digite o numero da conta: ");
		String conta = sc.nextLine();
		System.out.println("Digite o nome do titular: ");
		String nome = sc.nextLine();
		System.out.println("Deseja adicionar um saldo inicial? [1]Sim [2]Não");
		int aux = Integer.parseInt(sc.next());
		if (aux == 1) {
			System.out.println("Digite o valor a ser depositado: ");
			double saldo = Double.parseDouble(sc.next());
			c1 = new ContaBancaria(conta, nome, saldo);
		} else {
			c1 = new ContaBancaria(conta, nome);
		}

		while (aux != 5) {
			System.out.println("-=-=-=-=-=-=-=-=- Menu -=-=-=-=-=-=-=-=-");
			System.out.println("[1] Depósito");
			System.out.println("[2] Saque");
			System.out.println("[3] Saldo");
			System.out.println("[4] Dados Bancarios");
			System.out.println("[5] Sair");
			aux = Integer.parseInt(sc.next());

			switch (aux) {
			case 1:
				System.out.println("Digite o valor a ser depositado: ");
				c1.depositoConta(Double.parseDouble(sc.next()));
				break;

			case 2:
				System.out.println("Digite o valor a ser sacado: ");
				c1.saqueConta(Double.parseDouble(sc.next()));
				if (c1.getSaldoConta() < 0) {
					System.out.println("Saque realizado com sucesso. Sua conta está no cheque especial.");
				} else {
					System.out.println("Saque realizado com sucesso.");
				}
				break;

			case 3:
				System.out.println("Saldo da conta: " + c1.getSaldoConta());
				if (c1.getSaldoConta() < 0)
					System.out.println("Sua conta está no cheque especial.");

				break;

			case 4:
				System.out.println("Numero da conta: " + c1.getNumeroConta());
				System.out.println("Titular da conta: " + c1.getNomeTitular());
				System.out.println("Saldo da conta: " + c1.getSaldoConta());
				if (c1.getSaldoConta() < 0)
					System.out.println("Sua conta está no cheque especial.");
				break;

			case 5:
				System.out.println("Muito obrigado por utlizar nosso sistema.");
				aux = 5;
				break;

			default:
				System.out.println("Entre com uma opção válida.");
				break;
			}
		}

		sc.close();
	}
}
