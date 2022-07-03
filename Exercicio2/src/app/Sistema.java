package app;

import java.util.Scanner;

import entities.Funcionario;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.setNome(sc.nextLine());
		System.out.println("Salário Bruto: ");
		funcionario.setGrossSalary(Double.parseDouble(sc.nextLine()));
		System.out.println("Valor de imposto: ");
		funcionario.setTax(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Funcionario: " + funcionario);
		
		System.out.println("Aumentar o Salario? [1]Sim [2]Não");
		int auxiliar = Integer.parseInt(sc.nextLine());
		
		if(auxiliar == 1) {
			System.out.println("Insira a porcentagem de aumento: ");
			funcionario.aumentoSalario(Double.parseDouble(sc.nextLine()));
			System.out.println("Funcionario: " + funcionario);
		}
		
		sc.close();
	}
}
