package br.fiap.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.fiap.objetos.Pessoa;

public class ListaPessoasAlta implements ILista {
	private List<Pessoa> lista;

	public ListaPessoasAlta() {
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

}
