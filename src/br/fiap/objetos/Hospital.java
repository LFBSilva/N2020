package br.fiap.objetos;

public class Hospital extends Empresa {
	private int leitos;
	
	public Hospital(String nome, int cnpj) {
		super(nome, cnpj);
		// TODO Auto-generated constructor stub
	}
	public Hospital(String nome, int cnpj, int leitos) {
		super(nome, cnpj);
		this.leitos = leitos;
	}
	public int getLeitos() {
		return leitos;
	}

	public void setLeitos(int leitos) {
		this.leitos = leitos;
	}
	

}
