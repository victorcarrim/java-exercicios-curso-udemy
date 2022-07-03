package entities;

public class Funcionario {
	private String nome;
	private double grossSalary;
	private double tax;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double salarioLiquido() {
		return this.grossSalary - this.tax;
	}
	
	public void aumentoSalario(double porcentagem) {
		this.grossSalary = this.grossSalary + (this.grossSalary * (porcentagem/100));
	}
	
	public String toString() {
		return this.nome + " , $ " + salarioLiquido();
	}
}
