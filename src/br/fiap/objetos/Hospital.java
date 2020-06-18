package br.fiap.objetos;

import br.fiap.listas.ListaMedicos;
import br.fiap.listas.ListaPessoas;

public class Hospital extends Empresa {
	private int leitos;
	private ListaPessoas atendimendos;
	private ListaMedicos medicos;

	public Hospital(String nome, String cnpj) {
		super(nome, cnpj);
		// TODO Auto-generated constructor stub
	}

	public Hospital(String nome, String cnpj, int leitos) {
		super(nome, cnpj);
		this.leitos = leitos;
	}

	public int getLeitos() {
		return leitos;
	}

	public void setLeitos(int leitos) {
		this.leitos = leitos;
	}

	public ListaPessoas getAtendimendos() {
		return atendimendos;
	}

	public void setAtendimendos(ListaPessoas atendimendos) {
		this.atendimendos = atendimendos;
	}

	public ListaMedicos getMedicos() {
		return medicos;
	}

	public void setMedicos(ListaMedicos medicos) {
		this.medicos = medicos;
	}
}
