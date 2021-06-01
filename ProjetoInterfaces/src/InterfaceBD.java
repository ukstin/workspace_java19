/*
 * muitos autores traduzem "interface" como um "contrato", onde cada cabe�alho de m�todo
 * � associado ao termo de "cl�usulas"
 * 
 *  ou seja, na interface eu defino o que deve ser feito.
 *  
 *  e na classe que implementa? o "como" deve ser feito
 *  
 *  
 */
public interface InterfaceBD {
	
	public void conectar(String bd);
	public void executar(String comando);
	public void desconectar(String bd);
}
