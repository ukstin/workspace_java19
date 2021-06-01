package ui;

import core.Carro;
import core.Moto;
import core.Veiculo;

public class AppQueUsa {
	public static void main(String[] args) {
		Veiculo v1,v2;
		
		v1 = new Carro("Bemedabliu",2020,"xiszum");
		v2 = new Moto("Cegê",1975,125);
		v1.acelerar();
		v2.acelerar();
		v1.frear();
		v2.frear();
	}

}
