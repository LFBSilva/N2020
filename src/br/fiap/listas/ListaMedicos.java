package br.fiap.listas;

import java.util.ArrayList;
import java.util.List;

import br.fiap.objetos.Pessoa;

public class ListaMedicos implements ILista {
	private List<Pessoa> lista;

	public ListaMedicos() {
		this.lista = new ArrayList<Pessoa>();
	}

	@Override
	public void adicionar(Pessoa p) {
		lista.add(p);
	}

	public boolean remover(String cpf) {
		for (Pessoa pessoa : lista) {
			if (pessoa.getCpf().equals(cpf)) {
				lista.remove(lista.indexOf(pessoa));
				return true;
			}
		}
		return false;
	}

	@Override
	public Pessoa localizar(String cpf) {
		for (Pessoa pessoa : lista) {
			if (pessoa.getCpf().equals(cpf))
				return pessoa;
		}
		return null;
	}

}
