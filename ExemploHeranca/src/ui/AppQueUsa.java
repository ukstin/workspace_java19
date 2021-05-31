package ui;
import core.Estudante;
import core.Pessoa;

public class AppQueUsa {
	public static void main(String[] args) {
		Pessoa p = new Pessoa("Isidro","isidro@isidro.com","98765-4321");
		
//		p.setNome("Isidro");
//		p.setEmail("isidro@isidro.com");
//		p.setTelefone("98765-4321");
		
		p.mostrarInfo();
		Estudante e = new Estudante("Jose","jose@jose.com","91234-5678",1234,"Computação");		
//		e.setNome("Jose");
//		e.setEmail("jose@jose.com");
//		e.setTelefone("91234-5678");
//		e.setNumeroMatricula(1234);
//		e.setCurso("Computação");		
		
		e.mostrarInfo();
	}

}
