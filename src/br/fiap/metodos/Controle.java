package br.fiap.metodos;

import br.fiap.filas.IFila;
import br.fiap.listas.ILista;
import br.fiap.objetos.Hospital;
import br.fiap.objetos.Paciente;
import static javax.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;
import static java.lang.Float.parseFloat;

public class Controle {

	public static Paciente cadastrar() {

		return new Paciente(showInputDialog("Digite o Nome do Paciente:"),
				parseInt(showInputDialog("Digite a idade do paciente:")), showInputDialog("Digite o CPF do paciente:"),
				parseFloat(showInputDialog("Digite a altura do paciente:")),
				parseFloat(showInputDialog("Digite o Pesso do paciente:")));
	}

	public static Paciente localizar(ILista lista, String cpf) {
		return (Paciente) lista.localizar(cpf);
	}

	public static Paciente localizar(IFila fila, String cpf) {
		return (Paciente) fila.localizar(cpf);
	}

	public static Hospital cadastrarHospital() {
		return new Hospital(showInputDialog("Digite o nome do Hospital"),
				showInputDialog("Digite o número do CNPJ do Hospital"),
				parseInt(showInputDialog("Digite a quantidade de leitos que Hospitalpossui")));
	}
	
	

}