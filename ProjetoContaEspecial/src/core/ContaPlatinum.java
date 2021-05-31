package core;

public class ContaPlatinum extends Conta {
	private int carencia;

	public ContaPlatinum(String nomeTitular, String cpf, int numeroConta, double saldo, int carencia) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.carencia = carencia;
	}
	
	public String exibirInfo() {
		return "Conta Platinum:"+numeroConta+" ("+nomeTitular+"/"+cpf+ ")  R$ "+String.format("%.2f",saldo)+ " "+carencia+ " dias sem juros";
	}
	
	

}
