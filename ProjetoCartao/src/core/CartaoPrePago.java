package core;

public class CartaoPrePago {
	protected String numeroCartao;
	protected String nomeTitular;
	protected int    mesValidade;
	protected int    anoValidade;
	protected double saldo;
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int mesValidade, int anoValidade, double saldo) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		this.saldo += valor;
	}
	
	public boolean comprar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	
	@Override
	public String toString() {
		return "Cartao PrePago numeroCartao=" + numeroCartao + ", " + nomeTitular + " Val:"
				+ mesValidade + "/" + anoValidade + ", saldo=" + String.format("%.2f", saldo) ;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	

}
