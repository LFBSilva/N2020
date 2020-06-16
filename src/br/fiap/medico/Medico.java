package br.fiap.medico;

public class Medico {

	private String nome;
	private int cpf;
	private String crm;
	private String especialidade;
	
	public Medico(String nome, int cpf, String crm, String especialidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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
