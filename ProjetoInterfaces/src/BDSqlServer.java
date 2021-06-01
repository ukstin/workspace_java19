
public class BDSqlServer implements InterfaceBD {

	@Override
	public void conectar(String bd) {
		System.out.println("Connecting SQL Service on "+bd);
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mssql:>" +comando);
		
	}

	@Override
	public void desconectar(String bd) {
		System.out.println("Disconnected: "+bd);
		
	}

}
