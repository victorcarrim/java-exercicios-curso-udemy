package entities;

public class ContaBancaria {
	private String numeroConta;
	private String nomeTitular;
	private Double saldoConta;
	
	public ContaBancaria(String numeroConta, String nomeTitular, Double saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = saldoConta;
	}

	public ContaBancaria(String numeroConta, String nomeTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = 0.0;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}
	
	public void saqueConta(double saque) {
		this.saldoConta -= saque + 5.00; 
	}
	
	public void depositoConta(double deposito) {
		this.saldoConta += deposito;
	}
	
}
