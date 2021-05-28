package ui;

import core.Produto;

public class Loja {
	public static void main(String[] args) {
		Produto p1, p2, p3;
		
		
		p1 = new Produto(1234,"Computador que acende luzinha", 2000.0 );	
		
//		p1.setCodigo(1234);
//		p1.setDescricao("Computador que acende luzinha");
//		p1.setPreco(2000.00);
		
		p2 = new Produto(6548,"Cadeira gamer que reclina pra dormir", 799.99 );
//		p2.setCodigo(6548);
//		p2.setDescricao("Cadeira gamer que reclina pra dormir");
//		p2.setPreco(799.99);
		
		p3 = new Produto(2587,"Teclado barulhento que acente luzinha", 250.00 );
//		p3.setCodigo(2587);
//		p3.setDescricao("Teclado barulhento que acente luzinha");
//		p3.setPreco(250.00);
		
		System.out.println("OFERTA: "+p1.getDescricao()+ " DE R$ " + p1.getPreco() + " POR R$ "+p1.aplicarDesconto(15) );
		System.out.println("OFERTA: "+p2.getDescricao()+ " DE R$ " + p2.getPreco() + " POR R$ "+p2.aplicarDesconto(15) );
		System.out.println("OFERTA: "+p3.getDescricao()+ " DE R$ " + p3.getPreco() + " POR R$ "+p3.aplicarDesconto(15) );
	}

}
