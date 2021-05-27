
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1;
		
		e1 = new Empregado();
		e1.nome    = "Professor Isidro";
		e1.cargo   = "Professor";
		e1.salario = 15000.00;
		
		System.out.println(e1.exibirInfo());
		
		e1.aumentarSalario(20);
		
		System.out.println(e1.exibirInfo());
		
	}
}
