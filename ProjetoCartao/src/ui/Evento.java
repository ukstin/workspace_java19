package ui;

import core.CartaoCashBack;
import core.CartaoPrePago;

public class Evento {
	public static void main(String[] args) {
		
		CartaoPrePago c1;
		CartaoPrePago c2, c3, c4;
		
		
		c1 = new CartaoPrePago ("111 222 333 44","Cliente PP 1",10,2028, 0.0);
		c2 = new CartaoCashBack("222 333 444 55","Cliente CB 1",10,2028, 0.0, 1);
		c3 = new CartaoCashBack("222 333 444 66","Cliente CB 2",10,2028, 0.0, 2);
		c4 = new CartaoCashBack("222 333 444 77","Cliente CB 3",10,2028, 0.0, 3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		c1.adicionarCredito(1000);
		c2.adicionarCredito(1000);
		c3.adicionarCredito(1000);
		c4.adicionarCredito(1000);
		System.out.println("******************* credito de R$ 1000,00 em todos *****");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		c1.comprar(100);
		c2.comprar(100);
		c3.comprar(100);
		c4.comprar(100);
		System.out.println("******************* compra de R$ 100,00 em todos *****");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		
	}
}
