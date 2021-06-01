package core;

public class Moto extends Veiculo{
	private int cilind;

	public Moto(String marca, int ano, int cilind) {
		super(marca, ano);
		this.cilind = cilind;
	}

	@Override
	public void acelerar() {
		System.out.println("Moto "+super.marca+"/"+cilind+" acelera na mão PROPROPRORPORPORPORRO");		
	}

	@Override
	public void frear() {
		System.out.println("Moto "+super.marca+"/"+cilind+" freia no pé IJSploifje89wrju1342oijtnh5rfd");
	}
}
