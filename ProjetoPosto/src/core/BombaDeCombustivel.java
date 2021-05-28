package core;

public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double valorPagar;
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
	public void abastecerPorLitros(double litros) {
		this.qtdeLitros = litros;
		this.valorPagar = this.qtdeLitros * this.precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.valorPagar = valor;
		this.qtdeLitros = this.valorPagar / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo;
		recibo = "*******************************************************\n"+
		         " I S I D R O C O R P  Gas & Energy \n"+
				 "*******************************************************\n"+
		         " Recibo de Abastecimento de "+nome+"\n"+
				 " Preço do Litro R$  "+String.format("%.3f", this.precoLitro)+"\n"+
		         " Litros Abastecidos "+String.format("%.3f", this.qtdeLitros)+"\n"+
				 " Total a Pagar  R$  "+String.format("%.3f", this.valorPagar)+"\n"+
		         "*******************************************************";
		return recibo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdeLitros() {
		return qtdeLitros;
	}

	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	
	
	
}
