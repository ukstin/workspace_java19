package userinterface;

import core.Conta;
import core.ContaDiamond;
import core.ContaEspecial;
import core.ContaPlatinum;

import javax.swing.JOptionPane;

public class BancoEspecial {
	public static void main(String[] args) {

		Conta c1 = new Conta("Jose", "987.654.321-00", 123055, 0.0);
		Conta c2 = new ContaEspecial("Isidro","123.456.789-00", 123044, 0.0, 100.0);
		Conta c3 = new ContaPlatinum("Pedro", "456.789.123-00", 123066, 0, 10);
		Conta c4 = new ContaDiamond("Maria", "789.123.446-00", 123077, 0.0, 200, 5);
		
		c1.creditar(100);
		c2.creditar(100);
		c3.creditar(100);
		c4.creditar(100);
		
		System.out.println(c1.exibirInfo());
		System.out.println(c2.exibirInfo());
		System.out.println(c3.exibirInfo());
		System.out.println(c4.exibirInfo());
		
		
 
		
	}

}
