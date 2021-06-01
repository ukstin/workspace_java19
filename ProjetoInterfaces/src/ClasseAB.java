
public class ClasseAB implements InterfaceA, InterfaceB {

	public void meuCore() {
		System.out.println("aqui vai minha lógica de negócios unica");
	}
	
	@Override
	public void metodoB1() {
		System.out.println("Metodo B1");
		meuCore();
		
	}

	@Override
	public void metodoB2() {
		System.out.println("Metodo B2");
		meuCore();
	}

	@Override
	public void metodoA1() {
		System.out.println("Metodo A1");
		meuCore();
	}

	@Override
	public void metodoA2() {
		System.out.println("Metodo A2");
		meuCore();
	}

}
