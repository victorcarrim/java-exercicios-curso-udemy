package app;

import java.util.Scanner;

import entities.Aluno;

public class Sistema {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do Aluno: ");
		aluno.setName(sc.nextLine());
		System.out.println("Nota primeiro trimestre: ");
		aluno.setNota1(Double.parseDouble(sc.nextLine()));
		System.out.println("Nota segundo trimestre: ");
		aluno.setNota2(Double.parseDouble(sc.nextLine()));
		System.out.println("Nota terceiro trimestre: ");
		aluno.setNota3(Double.parseDouble(sc.nextLine()));
		
		if(aluno.notaFinal() < 60.0) {
			System.out.println("Nota Final: " + aluno.notaFinal());
			System.out.println("Reprovado");
			System.out.println("Faltou " + (60.0 - aluno.notaFinal()) + " pontos. ");
		} else {
			System.out.println("Nota Final: " + aluno.notaFinal());
			System.out.println("Aprovado");
		}
		
		sc.close();
	}
}
