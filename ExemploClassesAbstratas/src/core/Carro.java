package core;

public class Carro extends Veiculo{
	private String modelo;

	public Carro(String marca, int ano, String modelo) {
		super(marca, ano);
		this.modelo = modelo;
	}
	
	public void acelerar() {
		System.out.println("Carro "+super.marca+"/"+modelo+ " acelera no pé! VRUMMMMMM");
	}
	public void frear() {
		System.out.println("Carro "+super.marca+"/"+modelo+ " freia na mão!! IIIICHHHHCHH");
	}

}
