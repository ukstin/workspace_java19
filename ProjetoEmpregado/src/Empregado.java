
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	
	public Empregado(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	

	public Empregado(String nome, String cargo) {
		super();
		this.nome = nome;
		this.cargo = cargo;
	}
	
	public Empregado(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		String info;
		info = nome + " ("+cargo+")  R$ " + salario;
		return info;
	}
	
	public void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}
	
}


