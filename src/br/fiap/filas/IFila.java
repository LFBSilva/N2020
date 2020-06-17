package br.fiap.filas;

import br.fiap.objetos.Pessoa;

public interface IFila {

	public void adicionar(Pessoa p);

	public boolean remover(String cpf);

	public Pessoa localizar(String cpf);
}
