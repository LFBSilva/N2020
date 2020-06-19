package br.fiap.filas;

import static javax.swing.JOptionPane.showMessageDialog;

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
	
	public Pessoa proximoAtendimento() {

		if (fila.isEmpty() == false) {
			Pessoa p = fila.get(0);
			return remover(p.getCpf()) ? p : null;
		} else {
			showMessageDialog(null, "A fila de Internação está vazia");
			return null;
		}
	}
	
}
