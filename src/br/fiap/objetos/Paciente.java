package br.fiap.objetos;

public class Paciente extends Pessoa {
	protected Boolean grupoDeRisco;
	protected Boolean sintomas;
	protected Boolean assintomatico;

	public Paciente(String nome, int idade, String cpf, float altura, float peso) {
		super(nome, idade, cpf, altura, peso);
		// TODO Auto-generated constructor stub
	} // extends Object --> herda apenas métodos

	public Paciente(String nome, int idade, String cpf, Boolean grupoDeRisco, Boolean sintomas, Boolean assintomatico, float altura, float peso) {
		super(nome, idade, cpf, altura, peso);
		this.grupoDeRisco = grupoDeRisco;
		this.sintomas = sintomas;
		this.assintomatico = assintomatico;
	}

	public Boolean getGrupoDeRisco() {
		return grupoDeRisco;
	}

	public void setGrupoDeRisco(Boolean grupoDeRisco) {
		this.grupoDeRisco = grupoDeRisco;
	}

	public Boolean getSintomas() {
		return sintomas;
	}

	public void setSintomas(Boolean sintomas) {
		this.sintomas = sintomas;
	}

	public Boolean getAssintomatico() {
		return assintomatico;
	}

	public void setAssintomatico(Boolean assintomatico) {
		this.assintomatico = assintomatico;
	}

}