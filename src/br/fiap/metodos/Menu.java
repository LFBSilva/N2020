package br.fiap.metodos;

public class Menu {

	public static String menuPrincipal() {
		String aux = "Escolha uma op��o\n";
		aux += "1. Cadastrar Paciente\n";
		aux += "2. Verificar Leitos Disponiveis\n";
		aux += "3. Status Paciente\n";
		aux += "4. Diagnosticar Paciente\n";
		aux += "5. Mover para Interna��o\n";
		aux += "6. Mover para �bitos\n";
		aux += "7. Mover para Alta\n";
		aux += "8. Finalizar";
		return aux;
	}
}