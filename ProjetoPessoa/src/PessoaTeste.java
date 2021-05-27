
public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1, p2, p3;
		
		p1 = new Pessoa();
		p2 = new Pessoa();
		p3 = new Pessoa();
		
		p1.nome      = "Adamastor";
		p1.sobrenome = "Pereira";
		p1.idade     = 53;
		p1.sexo      = 'M';
		
		p2.nome      = "Albertina";
		p2.sobrenome = "Pereira";
		p2.idade     = 50;
		p2.sexo      = 'F';
		
		p3.nome      = "Alexandre";
		p3.sobrenome = "Pereira";
		p3.idade     = 25;
		p3.sexo      = 'M';
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
	}

}
