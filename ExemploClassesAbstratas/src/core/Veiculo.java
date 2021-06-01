package core;

public abstract class Veiculo {
	protected String marca;
	protected int    ano;
	
	public Veiculo(String marca, int ano) {
		super();
		this.marca = marca;
		this.ano = ano;
	}
	
	public abstract void acelerar();
	public abstract void frear();
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
