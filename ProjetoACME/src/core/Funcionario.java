package core;

public abstract class Funcionario {
	protected int numRegistro;
	protected String nome;
	
	public Funcionario(int numRegistro, String nome) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
	}
	
	// defino a "regra contratual" para os filhos cumprirem
	public abstract double calcularSalario();

	public String toString() {
		return String.format("%d %-20s R$ %.2f",numRegistro, nome, this.calcularSalario());
	}
	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
