package core;

public class ContaDiamond extends ContaEspecial {
	private int pontos;

	public ContaDiamond(String nomeTitular, String cpf, int numeroConta, double saldo, double limite, int pontos) {
		super(nomeTitular, cpf, numeroConta, saldo, limite);
		this.pontos = pontos;
	}
	
	public String exibirInfo() {
		return "Conta Diamond:" + super.numeroConta+" ("+super.nomeTitular+"/"+super.cpf+
				")  R$ "+String.format("%.2f", super.saldo)+ "  Limite R$ "+String.format("%.2f", super.limite)+
				"a cada R$1,00 em compras você recebe "+ pontos+" pontos";
	}

}
