
public class BDOracle implements InterfaceBD{

	@Override
	public void conectar(String bd) {
		System.out.println("Oracle connection on "+bd);		
	}

	@Override
	public void executar(String comando) {
		System.out.println("oracle> "+comando);		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Disconnecting from "+bd);		
	}
	

}
