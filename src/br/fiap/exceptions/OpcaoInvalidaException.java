package br.fiap.exception;

@SuppressWarnings("serial")
public class OpcaoInvalidaException extends Exception {

	public OpcaoInvalidaException(String msg) { //construtor é usado para receber uma msg e alterar a msg padrão da exceção
		super(msg);
	}

}
