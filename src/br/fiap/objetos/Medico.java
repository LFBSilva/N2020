package br.fiap.objetos;

public class Medico extends Pessoa {
	
	private String crm;
	
	private String especialidade;	

	public Medico(String nome, int idade, String cpf, String crm, String especialidade) {
		super(nome, idade, cpf);
		this.crm = crm;
		this.especialidade = especialidade;
	}	

	public Medico(String nome, int idade, String cpf, float altura, float peso, String crm, String especialidade) {
		super(nome, idade, cpf, altura, peso);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
