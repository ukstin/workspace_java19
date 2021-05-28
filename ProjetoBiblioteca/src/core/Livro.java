package core;

public class Livro {
	private String  autor;
	private String  titulo;
	private int     ano;
	private String  categ;
	private int     posE;
	private int     posP;
	private boolean emprestado;
	
	public Livro( String titulo, String autor, int ano, String categ, int posE, int posP, boolean emprestado) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.ano = ano;
		this.categ = categ;
		this.posE = posE;
		this.posP = posP;
		this.emprestado = emprestado;
	}
	
	public Livro() {
		// nao faz nada!
	}

	public void emprestar() {
		this.emprestado = true;
	}
	
	public void devolver() {
		this.emprestado = false;
	}
		
	public String exibirInfo() {
		String disp;
		if (emprestado) {
			disp = "EMPRESTADO";
		}
		else {
			disp = "DISPONIVEL PARA EMPRESTIMO";
		}
		return "Livro:"+titulo+"/"+autor+" ("+ano+") "+categ+" POS "+posE+":"+posP+"  "+disp;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCateg() {
		return categ;
	}

	public void setCateg(String categ) {
		this.categ = categ;
	}

	public int getPosE() {
		return posE;
	}

	public void setPosE(int posE) {
		this.posE = posE;
	}

	public int getPosP() {
		return posP;
	}

	public void setPosP(int posP) {
		this.posP = posP;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	

}
