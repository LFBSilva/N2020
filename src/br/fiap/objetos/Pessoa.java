package br.fiap.objetos;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected String cpf;
	protected float altura;
	protected float peso;

	public Pessoa(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, int idade, String cpf, float altura, float peso) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.altura = altura;
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
