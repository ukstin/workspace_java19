package nucleo;

public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public String exibirHoraUniversal() {
		return hora + ":"+minu+":"+segu;
	}
	
	public String exibirHoraPadrao() {
		int horaExibir;
		String sufixo;
		if (hora == 0) {
			horaExibir = 12;
			sufixo = "AM";
		}
		else if (hora == 12) {
			horaExibir = 12;
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			horaExibir = hora;
			sufixo = "AM";
		}
		else {  // to na hora entre 13 e 23
			horaExibir = hora - 12;
			sufixo = "PM";
		}
		return horaExibir + ":" + minu+ ":" +segu+ " " + sufixo;
	}
	
	/* Aqui nós temos um exemplo de SOBRECARGA 
	 * variação de parâmetros para o mesmo método
	 * 
	 * qual o objetivo disso? Proporcionar VERSATILIDADE para quem vai utilizar a nossa classe 
	 */
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minu = m;
		this.segu = s;
	}
	public void setTime(int h, int m) {
		this.hora = h;
		this.minu = m;
		this.segu = 0;		
	}
	public void setTime(int h) {
		this.hora = h;
		this.minu = 0;
		this.segu = 0;
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinu() {
		return minu;
	}
	public void setMinu(int minu) {
		this.minu = minu;
	}
	public int getSegu() {
		return segu;
	}
	public void setSegu(int segu) {
		this.segu = segu;
	}
	
	

}
