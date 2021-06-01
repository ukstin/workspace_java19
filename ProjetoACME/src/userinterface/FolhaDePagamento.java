package userinterface;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		ArrayList<Funcionario> lista;
		
		lista = new ArrayList<Funcionario>();
		
		lista.add(new Chefe(1001, "Antonia Duarte", 8000.00, 14.0,350.0 ));
		lista.add(new Comissionado(1002, "Jose Nogueira", 3500.0, 15.0));
		lista.add(new Horista(1003,"Priscila Tavares", 100,45.0 ));
		lista.add(new Horista(1004,"Gustavo Ribas", 120,45.0));
		lista.add(new Empreiteiro(1005, "Antenor Salgado", 4350.0));
		
		for (Funcionario f: lista) {
//			System.out.printf("%d  %-20s  R$ %.2f\n", f.getNumRegistro(), f.getNome(), f.calcularSalario());
			System.out.println(f);
		}
	}

}
