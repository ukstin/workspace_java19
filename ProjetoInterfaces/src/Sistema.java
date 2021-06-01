public class Sistema {
	public static void main(String[] args) {
		
		InterfaceBD ibd;
		
		ibd = new BDSqlServer();
		
		ibd.conectar("db_cliente");
		ibd.executar("Select * from tbl_clientes");
		ibd.desconectar("db_cliente");
		
		
		//---------------------------------------------
		
		ClasseAB oab = new ClasseAB();
		
		InterfaceA ia = oab;
		InterfaceB ib = oab;
		oab.metodoA1();
		oab.metodoA2();
		oab.metodoB1();
		oab.metodoB2();
		
	}

}
