package br.fiap.metodos;


import java.util.LinkedList;
import java.util.List;

import br.fiap.paciente.PacienteForaGrupoDeRisco;
import br.fiap.paciente.PacienteGrupoDeRisco;
import br.fiap.exceptions.OpcaoInvalidaException;
import br.fiap.objetos.Paciente;

import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Controle {

	private static List<Paciente> listaPaciente = new LinkedList<Paciente>();


	public static void cadastrar() throws OpcaoInvalidaException {
		int opcao;

		String nome = showInputDialog("Nome do paciente: ");
		long cpf = parseLong(showInputDialog("CPF do paciente"));

		opcao = parseInt(showInputDialog(Menu.menuCadastroPaciente()));
		if (opcao < 1 || opcao > 2) {
			throw new OpcaoInvalidaException("A opção deve estar entre 1 e 2 ");
		}
		
		if( opcao ==1) {
			String aux = "";
			String hipertenso = showInputDialog("O paciente é Hipertenso? (Sim ou Não) ");
			aux += "Possui Hipertensão? "+hipertenso+" \n";
			String asmatico = showInputDialog("O paciente é Asmático? (Sim ou Não) ");
			aux += "Possui Hipertensão? "+asmatico+" \n";
			String diabetico = showInputDialog("O paciente é Diabético? (Sim ou Não) ");
			aux += "Possui Hipertensão? "+diabetico+" \n";
			String fumante = showInputDialog("O paciente é fumante? (Sim ou Não) ");
			aux += "Possui Hipertensão? "+fumante+" \n";
			int idade = parseInt(showInputDialog("Qual a idade do paciente? "));
			aux += "Idade: "+idade+" \n";
			if (aux.toLowerCase().contains("sim".toLowerCase()) || idade < 6 || idade > 44) {
				showMessageDialog(null, "O paciente faz parte do Grupo de risco");
				listaPaciente.add(new PacienteGrupoDeRisco(cpf, nome, hipertenso, asmatico, diabetico, fumante, idade));
		} else {
			showMessageDialog(null, "O paciente não faz parte do Grupo de risco");
		}
	}
	}
}

/*public class Controle {

	// metodo static para acessar pelo main sem gerar objeto
	// lista privada, sem acesso para as outras classes
	private static List<Empregado> lista = new LinkedList<Empregado>();

	public static void cadastrar() throws OpcaoInvalidaException { // metodo nao trata a exceçao aqui, ele lança para o
																	// mtd de exceçao
		int opcao;

		String nome = showInputDialog("Nome do empregado: ");
		long matricula = parseLong(showInputDialog("Matricula do empregado: "));

		opcao = parseInt(showInputDialog(Menu.menuSecundario()));
		if (opcao < 1 || opcao > 2) {
			throw new OpcaoInvalidaException("A opção deve estar entre 1 e 2 ");
		}

		if (opcao == 1) {
			double totalDeVendas = parseDouble(showInputDialog("Total de Vendas: "));
			double comissao = parseDouble(showInputDialog("Comissão de Vendas: "));
			lista.add(new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao));
		} else {
			int totalDeHorasTrabalhadas = parseInt((showInputDialog("Total de horas trabalhadas: ")));
			double valorDaHoraTrabalhada = parseDouble(showInputDialog("Valor da hora trabalhada: "));
			lista.add(new EmpregadoHorista(matricula, nome, totalDeHorasTrabalhadas, valorDaHoraTrabalhada));
		}
	}

	public static void listar() {
		String auxHorista = "EMPREGADOS HORISTAS \n";
		String auxComissionado = "EMPREGADOS COMISSIONADOS \n";

		for (Empregado e : lista) {
			if (e instanceof EmpregadoHorista) {
				auxHorista += e + "\n";
			} else {
				auxComissionado += e + "\n";
			}
		}

		showMessageDialog(null, auxHorista + auxComissionado);

	}

	public static void desligar() {

		long matricula = parseLong(showInputDialog("Informe a matricula a ser desligada: "));
		Empregado e;

		// percorre a lista (cria uma copia da lista remove depois atualiza a original)
		Iterator<Empregado> it = lista.iterator();
		while (it.hasNext()) {
			e = it.next();
			if (e.getMatricula() == matricula) {
				it.remove();
			}
		}

	}

}*/
