package br.fiap.filas;

import java.util.ArrayList;
import java.util.List;

import br.fiap.objetos.Pessoa;

public class FilaInternacao implements IFila {

	private List<Pessoa> fila = new ArrayList<Pessoa>();
	
	@Override
	public void adicionar(Pessoa p) {
		fila.add(p);
	}

	@Override
	public boolean remover(String cpf) {
		for (Pessoa pessoa : fila) {
			if(pessoa.getCpf().equals(cpf)) {
				fila.remove(fila.indexOf(pessoa));
				return true;
			} 			
		}
		return false;
		
	}

	@Override
	public Pessoa localizar(String cpf) {
		for (Pessoa pessoa : fila) {
			if(pessoa.getCpf().equals(cpf)) return pessoa;
		}
		return null;
	}
	
}
