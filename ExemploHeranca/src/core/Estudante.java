package core;

/* o Tipo Estudante amplia a definição do tipo Pessoa
 * isso significa que: o Tipo Estudante TEM TUDO O QUE TEM EM PESSOA, mais as suas próprias características
 */
public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	


	public void mostrarInfo() {
		System.out.println("Estudante = "+nome+" "+email+" "+telefone+" "+numeroMatricula+" "+curso);
		
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
