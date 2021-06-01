package core;

public class Horista extends Funcionario {
	private int numHoras;
	private double valorHora;
	
	public Horista(int numRegistro, String nome, int numHoras, double valorHora) {
		super(numRegistro, nome);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	public double calcularSalario() {
		return valorHora * numHoras;
	}
	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	

}
