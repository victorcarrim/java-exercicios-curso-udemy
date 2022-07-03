package entities;

public class Aluno {
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	public double notaFinal() {
		return this.nota1 + this.nota2 + this.nota3;
	}
}
