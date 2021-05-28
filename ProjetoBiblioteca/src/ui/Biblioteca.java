package ui;

import core.CadastradorDeLivros;
import core.Livro;

public class Biblioteca {
	public static void main(String[] args) {
		
		Livro l1, l2, l3;
		
		l1 = new Livro("Java Para Iniciantes", "Prof. Isidro", 2021, "Terror", 2, 3, false);
		l2 = new Livro("Aprenda a Programar ", "Prof. Isidro", 2021,"Auto Ajuda", 3, 6, true);
		l3 = new Livro("Ganhe 1 milhão programando", "Ze",2021,"Ficcao", 6, 7, false);
		
//		System.out.println(l1.exibirInfo());
//		System.out.println(l2.exibirInfo());
//		System.out.println(l3.exibirInfo());
		
		l2.devolver();
		
//		System.out.println(l2.exibirInfo());
		
		Livro l4 = new Livro();
		
		CadastradorDeLivros cadastrador = new CadastradorDeLivros();
		
//		System.out.println("Antes de preencher   = "+l4.exibirInfo());
//		cadastrador.preencherInfoDoLivro(l4);
//		System.out.println("Depois de preenchido = "+l4.exibirInfo());
//		
//		System.out.println(l1.exibirInfo());
//		System.out.println(l4.exibirInfo());
//		
//		System.out.println(" --> alterando o nome do l4 ");
//		l4.setTitulo("Java for Beginners");
//		
//		System.out.println(l1.exibirInfo());
//		System.out.println(l4.exibirInfo());
		
		String s1 = new String("Oi quer tc?");
		String s2 = new String("Oi quer tc?");
		
		if (s1 == s2) {
			System.out.println("Apontam para o mesmo endereço de memória");
		}
		else {
			System.out.println("Apontam para áreas de memória diferentes");
		}
		
		if (s1.equals(s2)) {
			System.out.println("tem o mesmo conteudo");
		}
		else {
			System.out.println("tem conteudos distintos");
		}
		
		
	}

}
