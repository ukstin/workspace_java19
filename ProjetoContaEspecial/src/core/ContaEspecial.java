package core;

public class ContaEspecial extends Conta {
	protected double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}
	
	public boolean debitar(double valor) {
		if (super.saldo + this.limite >= valor) {
			super.saldo -= valor;  // saldo = saldo - valor;
			return true;
		}
		return false;		
	}
	
	public String exibirInfo() {
		return "Conta Especial: "+super.numeroConta+ " ("+super.nomeTitular+"/"+super.cpf+
				") R$ "+String.format("%.2f", super.saldo) + 
				"  Limite R$ "+String.format("%.2f", this.limite);
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
