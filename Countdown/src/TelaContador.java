import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaContador extends JFrame implements Runnable {
	
	private int tempo;
	private JLabel texto;
	public TelaContador(int tempo) {
		this.tempo = tempo;
		texto = new JLabel();
		this.setLayout(null);
		this.setTitle("Esta mensagem se auto-destruirá");
		
		this.setBounds(1800,0,300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		texto.setText("TEMPO: "+tempo);
		texto.setBounds(50, 50, 300, 100);
		texto.setFont(new Font("Arial", 0, 20));
		getContentPane().add(texto);		
		
		Thread t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		
		try {
			while (tempo > 0) {
				tempo--;
				Thread.sleep(1000);
				texto.setText("TEMPO: "+tempo);				
			}
			texto.setText("BUUUMMMM");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
