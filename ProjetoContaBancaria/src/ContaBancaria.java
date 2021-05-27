
public class ContaBancaria {
	private int    numeroConta;
	private int    digitoV;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	
	public String exibirInfo() {
		String info;
		info = numeroConta+"-"+digitoV+" "+nomeTitular+
			   " ("+cpfTitular+") R$ "+String.format("%.2f", saldo);
	    return info;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public boolean sacar(double valor) {
		boolean res;
		if (saldo >= valor) {
			saldo = saldo - valor;
			res = true;
		}
		else {
			res = false;
		}
		return res;		
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public int getDigitoV() {
		return digitoV;
	}
	
	public void setDigitoV(int digitoV) {
		this.digitoV = digitoV;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public String getCpfTitular() {
		return cpfTitular;
	}
	
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
