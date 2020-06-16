package br.fiap.main;

//Se importa metodo, o static é pra reduzir o codigo  
import static javax.swing.JOptionPane.*; //importa metodos static    //* importa todos metodos

import br.fiap.controle.Controle;
import br.fiap.exception.OpcaoInvalidaException;
import br.fiap.menu.Menu;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		int opcao = 0;

		do {
			try {
				opcao = parseInt(showInputDialog(Menu.menuPrincipal()));
				if(opcao < 1 || opcao > 4) {
					throw new OpcaoInvalidaException("A opção deve estar entre 1 e 4");
				}
				switch(opcao) {
				case 1:
					Controle.cadastrar();
					break;
				case 2:
					
					break;
				case 3:
					break;
				}
				
				
			}catch (NumberFormatException e) {
				showMessageDialog(null, "Voce deve digitar um número \n" + e);
			} catch(OpcaoInvalidaException e) {
				showMessageDialog(null, e);
			}

		} while (opcao != 4);
	}

}
