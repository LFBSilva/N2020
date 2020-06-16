package br.fiap.paciente;

public class PacienteGrupoDeRisco extends Paciente {
	
	private String hipertenso;
	private String asmatico;
	private String diabetico;
	private String fumante;
	private int idade;
	
	public PacienteGrupoDeRisco(long cpf, String nome, String hipertenso, String asmatico, String diabetico,
			String fumante, int idade) {
		super(cpf, nome);
		this.hipertenso = hipertenso;
		this.asmatico = asmatico;
		this.diabetico = diabetico;
		this.fumante = fumante;
		this.idade = idade;
	}

	public String getHipertenso() {
		return hipertenso;
	}

	public void setHipertenso(String hipertenso) {
		this.hipertenso = hipertenso;
	}

	public String getAsmatico() {
		return asmatico;
	}

	public void setAsmatico(String asmatico) {
		this.asmatico = asmatico;
	}

	public String getDiabetico() {
		return diabetico;
	}

	public void setDiabetico(String diabetico) {
		this.diabetico = diabetico;
	}

	public String getFumante() {
		return fumante;
	}

	public void setFumante(String fumante) {
		this.fumante = fumante;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}