package br.fiap.exceptions;

@SuppressWarnings("serial")
public class OpcaoInvalidaException extends Exception {

	public OpcaoInvalidaException(String msg) { //construtor � usado para receber uma msg e alterar a msg padr�o da exce��o
		super(msg);
	}

}
