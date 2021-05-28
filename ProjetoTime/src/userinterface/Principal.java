package userinterface;

import nucleo.Time;

public class Principal {
	public static void main(String[] args) {
		
		Time t = new Time();		
		
//		t.setTime(22, 29, 35);
		
		t.setTime(22,30);
		System.out.println(t.exibirHoraUniversal());
		System.out.println(t.exibirHoraPadrao());
	}
}
