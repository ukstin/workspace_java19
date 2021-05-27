/* Esta classe NÃO TEM MAIN
 * porque o objetivo dela é ser apenas a definição do novo tipo de dado
 * para armazenar as informações do carro
 */
public class Carro {

	String marca;
	String modelo;
	int    ano;
	String cor;
	int    km;
	String combustivel;
	double preco;
	
	void mostrarAnuncio(){
		System.out.println(marca+ " "+modelo + " ("+ano+")");
		System.out.println("Cor "+cor);
		System.out.println("Km: "+km+"  Comb: "+combustivel);
		System.out.println("Preco R$ "+preco);
	}
	
	double calcularIPVA(){
		double valorIPVA;
		if (ano > 2000) {
			valorIPVA = preco * 0.04;
		}
		else {
			valorIPVA = 0.0;
		}
		return valorIPVA;
	}
}
