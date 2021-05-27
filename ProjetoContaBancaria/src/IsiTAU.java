import java.util.Scanner;

public class IsiTAU {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		
		ContaBancaria c = new ContaBancaria();
		c.setNumeroConta(100123);
		c.setDigitoV(4);
		c.setNomeTitular("Professor Isidro");
		c.setCpfTitular("987.654.321-00");
		
		do {
			System.out.println("IsiTAU - Seu banco na NET");
			System.out.println("Digite 1-deposito / 2-saque / 3-info / 0-sair");
			opcao = teclado.nextInt();
			switch(opcao) {
				case 1:
					System.out.println(" ---> Digite o valor a depositar");
					valor = teclado.nextDouble();
					c.depositar(valor);
					break;
				case 2:
					System.out.println(" ---> Digite o valor a SACAR");
					valor = teclado.nextDouble();
					if (c.sacar(valor)) {
						System.out.println("Saque autorizado!");
					}
					else {
						System.out.println("Saldo insuficiente");
					}
					break;
				case 3:
					System.out.println(c.exibirInfo());
					break;
				case 0:
					System.out.println("Obrigado pela preferencia");
					break;
				default:
					System.out.println("Opcao INVALIDA");
			}
			
		} while (opcao != 0);
		
	}

}
