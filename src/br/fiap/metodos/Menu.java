package br.fiap.metodos;

public class Menu {

	public static String menuPrincipal() {
		String aux = "Escolha uma opção\n";
		aux += "1. Cadastrar Paciente\n";
		aux += "2. Verificar Leitos Disponiveis\n";
		aux += "3. Status Paciente\n";
		aux += "4. Diagnosticar Paciente\n";
		aux += "5. Mover para Internação\n";
		aux += "6. Mover para Óbitos\n";
		aux += "7. Mover para Alta\n";
		aux += "8. Finalizar";
		return aux;
	}
}