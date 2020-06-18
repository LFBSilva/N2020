package br.fiap.metodos;

public class Menu {
	
	public static String menuPrincipal() {
		String aux = "Escolha uma opção\n";
		aux += "1. Cadastrar Paciente\n";
		aux += "2. Verificar Leitos Disponiveis\n";
		aux += "3. Status Paciente\n";
		aux += "4. Finalizar";
		return aux;
	}
	
	public static String menuCadastroPaciente() {
		String aux = "Identificação de Grupos\n";
		aux += "1. Atender Paciente \n";
		aux += "2. Finalizar";
		return aux;
	}	
	
		
}