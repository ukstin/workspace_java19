
public class Empregado {
	String nome;
	String cargo;
	double salario;
	
	String exibirInfo() {
		String info;
		info = nome + " ("+cargo+")  R$ " + salario;
		return info;
	}
	
	void aumentarSalario(double percentual) {
		salario = salario + salario * percentual / 100;
	}
	
}
