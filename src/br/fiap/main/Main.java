package br.fiap.main;

//Se importa metodo, o static é pra reduzir o codigo  
import static javax.swing.JOptionPane.*; //importa metodos static    //* importa todos metodos

import br.fiap.exceptions.OpcaoInvalidaException;
import br.fiap.filas.FilaAtendimento;
import br.fiap.filas.FilaInternacao;
import br.fiap.listas.ILista;
import br.fiap.listas.ListaInternacao;
import br.fiap.listas.ListaMedicos;
import br.fiap.listas.ListaPessoas;
import br.fiap.listas.ListaPessoasAlta;
import br.fiap.listas.ListaPessoasObitos;
import br.fiap.metodos.Controle;
import br.fiap.metodos.Menu;
import br.fiap.metodos.ValidacaoAssintomatico;
import br.fiap.metodos.ValidacaoGrupoRisco;
import br.fiap.metodos.ValidacaoSintomas;
import br.fiap.objetos.Hospital;
import br.fiap.objetos.Paciente;
import br.fiap.objetos.Pessoa;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

@SuppressWarnings("unused")
public class Main {

	private static FilaInternacao filaInternacao = new FilaInternacao();
	private static FilaAtendimento filaAtendimento = new FilaAtendimento();
	private static ListaPessoasAlta listaPessoasAlta = new ListaPessoasAlta();
	private static ListaPessoasObitos listaPessoasObitos = new ListaPessoasObitos();
	private static ListaPessoas listaPessoa = new ListaPessoas();
	private static ListaInternacao listaInternacao = new ListaInternacao();

	public static void main(String[] args) {

		int opcao = 0;

		Hospital hospital = Controle.cadastrarHospital();

		do {
			try {
				opcao = parseInt(showInputDialog(Menu.menuPrincipal()));
				if (opcao < 1 || opcao > 4) {
					throw new OpcaoInvalidaException("A opção deve estar entre 1 e 4");
				}
				switch (opcao) {
				case 1:

					Paciente p = Controle.cadastrar();
					filaAtendimento.adicionar(p);
					listaPessoa.adicionar(p);
					hospital.setAtendimendos(listaPessoa);
					break;
				case 2:
					showMessageDialog(null, VerificarLeitos(hospital, listaInternacao));
					break;
				case 3:
					showMessageDialog(null, (String) Locacalizar(showInputDialog("Por favor informe seu CPF: ")));
					break;
				}

			} catch (NumberFormatException e) {
				showMessageDialog(null, "Voce deve digitar um número \n" + e);
			} catch (OpcaoInvalidaException e) {
				showMessageDialog(null, e);
			}

		} while (opcao != 4);
	}

	private static String Locacalizar(String cpf) {
		String localizacao = null;
		localizacao = Controle.localizar(filaAtendimento, cpf) != null ? "Em Atendimento" : null;
		localizacao = Controle.localizar(filaInternacao, cpf) != null ? "Internado" : null;
		localizacao = Controle.localizar(listaPessoasAlta, cpf) != null ? "Esta de Alta" : null;
		localizacao = Controle.localizar(listaPessoasObitos, cpf) != null ? "Morto" : null;
		return localizacao == null ? "CPF não cadastrado" : localizacao;
	}
	
	private static String VerificarLeitos(Hospital hospital, ListaInternacao lista) {
		return "A quantidade de leitos disponíveis é de: " + Integer.toString(lista.LeitosOcupados() - hospital.getLeitos());
	}

		
}

// p.setAssintomatico(new ValidacaoAssintomatico().Validacao());
// p.setGrupoDeRisco(new ValidacaoGrupoRisco().Validacao(p));
// p.setSintomas(new ValidacaoSintomas().Validacao());
// showMessageDialog(null, p.getNome() + "\n" + p.getAssintomatico() + "\n" + p.getGrupoDeRisco()
//		+ "\n" + p.getSintomas());