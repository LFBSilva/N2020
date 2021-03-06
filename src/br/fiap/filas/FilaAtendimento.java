package br.fiap.filas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import br.fiap.objetos.Pessoa;
import static javax.swing.JOptionPane.*;

public class FilaAtendimento implements IFila {
	public FilaAtendimento() {
		this.fila = new ArrayList<Pessoa>();
	}

	private List<Pessoa> fila;

	@Override
	public void adicionar(Pessoa p) {
		fila.add(p);
	}

	@Override
	public boolean remover(String cpf) {
		// TODO Auto-generated method stub
		Pessoa p;

		Iterator<Pessoa> it = fila.iterator();
		while (it.hasNext()) {
			p = it.next();
			if (p.getCpf() == cpf.toUpperCase()) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public Pessoa localizar(String cpf) {
		Pessoa p;

		Iterator<Pessoa> it = fila.iterator();
		while (it.hasNext()) {
			p = it.next();
			if (p.getCpf() == cpf) {
				return p;
			}
		}
		return null;

	}

	public Pessoa proximoAtendimento() {

		if (fila.isEmpty() == false) {
			Pessoa p = fila.get(0);
			return remover(p.getCpf()) ? p : null;
		} else {
			showMessageDialog(null, "A fila de atendimento est� vazia");
			return null;
		}
	}
}