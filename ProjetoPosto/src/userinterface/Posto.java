package userinterface;

import java.util.Scanner;

import core.BombaDeCombustivel;

public class Posto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		BombaDeCombustivel b = new BombaDeCombustivel("Gasolina Plus", 2.59);
		int opcao;
		double valor;
		
		do {
			System.out.println("Bem vindo à IsidroCorp Gas & Energy");
			System.out.println("Digite 1-Litros / 2-Valor / 0-Sair");
			opcao = teclado.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Quantos Litros?");
				valor = teclado.nextDouble();
				b.abastecerPorLitros(valor);
				System.out.println(b.exibirRecibo());
				break;
			case 2:
				System.out.println("Qual o valor?");
				valor = teclado.nextDouble();
				b.abastecerPorValor(valor);
				System.out.println(b.exibirRecibo());
				break;
			case 0:
				System.out.println("Obrigado pela preferencia");
				break;
			default:
				System.out.println("Opcao Inválida!");
			}
		} while (opcao != 0);
		
		teclado.close();
		
	}

}
