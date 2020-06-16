package br.fiap.hospital;

import java.awt.List;
import java.util.LinkedList;

import br.fiap.paciente.Paciente;


public class Hospital {

	private String nome;
	private int cnpj;
	private int leitos;
	
	private static LinkedList<Paciente> filaAtendimento = new LinkedList<Paciente>();
	
	public Hospital(String nome, int cnpj, int leitos) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.leitos = leitos;
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

	public int getLeitos() {
		return leitos;
	}

	public void setLeitos(int leitos) {
		this.leitos = leitos;
	}
	

}
