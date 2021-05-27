
public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado e1;
		
		e1 = new Empregado();
		e1.setNome("Professor Isidro");
		e1.setCargo("Professor");
		e1.setSalario(15000.00);
		
		System.out.println(e1.exibirInfo());
		
		e1.aumentarSalario(20);
		
		System.out.println(e1.exibirInfo());
		System.out.println("Exibindo apenas o salario "+e1.getSalario());
		
	}
}
