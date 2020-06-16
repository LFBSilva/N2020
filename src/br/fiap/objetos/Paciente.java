package br.fiap.paciente;

public abstract class Paciente { //extends Object --> herda apenas métodos
	protected long cpf; //deixa visível para as classes filhas
	protected String nome;
	
	public Paciente(long cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "CPF --> "+cpf+"\n";
		aux += "Nome --> "+nome+"\n";
		return aux;
	}


	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
}