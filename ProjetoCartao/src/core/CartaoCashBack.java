package core;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo;  // 1 - GOLD, 2 - SILVER, 3 - BRONZE

	public CartaoCashBack(String numeroCartao, String nomeTitular, int mesValidade, int anoValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, mesValidade, anoValidade, saldo);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			
//			if (tipo == 1) {
//				saldo += valor * 0.08;
//			}
//			else if (tipo == 2) {
//				saldo += valor * 0.05;
//			}
//			else {
//				saldo += valor * 0.02;
//			}
			switch(tipo) {
			case 1:
				saldo += valor * 0.08;
				break;
			case 2:
				saldo += valor *0.05;
				break;
			case 3:
				saldo += valor *0.02;
				break;
			}
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CartaoCashBack numeroCartao=" + numeroCartao + ", " + nomeTitular
				+ " Val:" + mesValidade + "/" + anoValidade + ", saldo=" +String.format("%.2f", saldo) + " tipo = "+tipo;
	}
	
	
	
	

}
