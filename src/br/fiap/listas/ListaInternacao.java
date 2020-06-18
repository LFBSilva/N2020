package br.fiap.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.fiap.objetos.Pessoa;

public class ListaInternacao implements ILista {

	private List<Pessoa> lista;

	public ListaInternacao() {
		this.lista = new ArrayList<Pessoa>();
	}

	@Override
	public void adicionar(Pessoa p) {

		lista.add(p);
	}

	@Override
	public Pessoa localizar(String cpf) {
		Pessoa p;

		Iterator<Pessoa> it = lista.iterator();
		while (it.hasNext()) {
			p = it.next();
			if (p.getCpf() == cpf) {
				return p;
			}
		}
		return null;
	}

	public boolean remover(String cpf) {
		// TODO Auto-generated method stub
		Pessoa p;

		Iterator<Pessoa> it = lista.iterator();
		while (it.hasNext()) {
			p = it.next();
			if (p.getCpf() == cpf.toUpperCase()) {
				it.remove();
				return true;
			}
		}
		return false;
	}
	
	public int LeitosOcupados() {
		return lista.size();
	}

}
