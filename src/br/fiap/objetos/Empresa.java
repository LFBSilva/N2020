package br.fiap.objetos;

public abstract class Empresa {
	protected String nome;
	protected int cnpj;
	public Empresa(String nome, int cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}
