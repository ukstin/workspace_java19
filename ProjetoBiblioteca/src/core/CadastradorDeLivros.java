package core;

import java.util.Scanner;

public class CadastradorDeLivros {
	
	public void preencherInfoDoLivro(Livro l) {
		Scanner teclado = new Scanner(System.in);
		String autor, titulo, categoria;
		int    ano, posE, posP;
		
		System.out.println("Por favor preencha o Titulo");
		titulo = teclado.nextLine();
		System.out.println("Por favor preencha o autor");
		autor = teclado.nextLine();
		System.out.println("Por favor preencha a categoria");
		categoria = teclado.nextLine();
		System.out.println("Por favor preencha o ano ");
		ano = teclado.nextInt();
		System.out.println("Por favor informe a estante e a prateleira");
		posE = teclado.nextInt();
		posP = teclado.nextInt();
		
		l.setTitulo(titulo);
		l.setAutor(autor);
		l.setCateg(categoria);
		l.setAno(ano);
		l.setPosE(posE);
		l.setPosP(posP);
	}
}
