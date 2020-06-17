package br.fiap.listas;

import br.fiap.objetos.Pessoa;

public interface ILista {

	public void adicionar(Pessoa p);

	public Pessoa localizar(String cpf);
}
