import java.util.ArrayList;

public class EmpregadoTeste {
	public static void main(String[] args) {
		ArrayList<Empregado> lista;
		
		lista = new ArrayList<Empregado>();
		
		
		lista.add(new Empregado("Isidro","Professor  ", 5000.00));
		lista.add(new Empregado("Pedro ","Diretor    ", 6000.00));
		lista.add(new Empregado("Maria ","Supervisora", 7000.00));
		
		for (int pos=0; pos < lista.size(); pos++) {
			Empregado e = lista.get(pos);
			System.out.println(e);
		}
		
		for (Empregado e : lista) { // para cada Empregado "e" na lista
			e.aumentarSalario(10.0);
			System.out.println(e);
		}
	}
}
