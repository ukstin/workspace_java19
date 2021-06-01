
public class BDMySQL implements InterfaceBD {

	public void conectar(String bd) {
		System.out.println("Conectando motor MYSQL no banco "+bd);
	}
	public void executar(String comando) {
		System.out.println("mysql> "+comando);
	}
	public void desconectar(String bd) {
		System.out.println("Desconenctando do banco "+bd);
	}
}
