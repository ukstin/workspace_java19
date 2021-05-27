
public class Loja {
	public static void main(String[] args) {
		/*
		 *   Carro => tipo de dado (Classe)
		 *   c     => variável deste tipo (c armazena marca, modelo, ano, km, cor, combustivel, preco)
		 */
		Carro c;
		c = new Carro();   // não basta declarar, preciso pedir ao Java para reservar a memória
		
		// Carro c = new Carro();
		c.marca = "Pórxi";
		c.modelo = "Kayene";
		c.ano    = 2018;
		c.cor    = "Preto";
		c.km     = 15000;
		c.combustivel = "Gasolina/Eletrico";
		c.preco       = 800000.00;
		
		Carro c2 = new Carro();
		c2.marca = "Xevrolé";
		c2.modelo = "Korça";
		c2.ano    = 1996;
		c2.cor    = "Branco com detalhes preto pq o carro é guerreiro";
		c2.km     = 350000;
		c2.combustivel = "Gasolina, mas se tiver caro, funciona com alcool tb";
		c2.preco       = 7500.00;
		
		// exibindo o anuncio
		System.out.println("==== UébiMotors --- sua loja de carros na NET! ===");
		c.mostrarAnuncio();
		double v = c.calcularIPVA();
		System.out.println("O valor do IPVA desta máquina é "+v);
		
		
		System.out.println(" -------------------------- ");
		c2.mostrarAnuncio();
		double v2 = c2.calcularIPVA();
		System.out.println("IPVA do carro que é filé! "+v2);
		
		
		c2.mudarPreco(0);  // internamente na função mudarPreco o parâmetro
								 // novoPreco = 5999.99
		
		
		System.out.println("O patrao ficou doido... o carro agora custa R$ "+c2.preco);
		
	
		
	}
}
