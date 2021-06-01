package ui;

import java.util.ArrayList;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		ArrayList<CartaoPrePago> lista;
		
		lista = new ArrayList<CartaoPrePago>();
		
		lista.add(new CartaoPrePago ("111 222 333 44","Cliente PP 1",10,2028, 0.0));
		lista.add(new CartaoCashBack("222 333 444 55","Cliente CB 1",10,2028, 0.0, 1));
		lista.add(new CartaoCashBack("222 333 444 66","Cliente CB 2",10,2028, 0.0, 2));
		lista.add(new CartaoCashBack("222 333 444 77","Cliente CB 3",10,2028, 0.0, 3));
		
		for (int pos=0; pos < lista.size(); pos++) {
			lista.get(pos).adicionarCredito(1000);
			System.out.println(lista.get(pos));
		}
		
		
	}
}
