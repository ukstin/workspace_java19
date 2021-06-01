import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String _strId, _strPreco, _strOp;
		int _id;
		String _desc;
		double _preco;
		int opcao = 1;

		do {

			try {
				Produto p = new Produto();
				System.out.print("Digite o id do produto:");
				_strId = teclado.nextLine();
				_id = Integer.parseInt(_strId);
				p.setId(_id);

				System.out.print("Digite a descricao do produto:");
				_desc = teclado.nextLine();
				p.setDescricao(_desc);

				System.out.print("Digite o preco do produto:");
				_strPreco = teclado.nextLine();
				_preco = Double.parseDouble(_strPreco);
				p.setPreco(_preco);

				System.out.println("Cadastrado = " + p);
				System.out.println("Deseja cadastrar outro produto? (1-sim/0-nao)");
				opcao = Integer.parseInt(teclado.nextLine());
			} catch (IsiException ex) {
				System.out.println("Erro na regra de negocios - " + ex.getMessage());
			} catch (NumberFormatException ex) {
				System.out.println("Ei, esta entrada deve ser um número!!");
			} catch (Exception ex) {
				System.out.println("Xiiii deu ruim: " + ex.getMessage());
				System.out.println("Tipo da excecao = " + ex.getClass().getName());
			}
		} while (opcao != 0);

		teclado.close();
	}

}
