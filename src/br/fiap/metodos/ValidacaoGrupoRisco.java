package br.fiap.metodos;

import javax.swing.JOptionPane;

import br.fiap.objetos.Pessoa;

public class ValidacaoGrupoRisco {

	protected boolean ValidacaoObesidade(float altura, float peso) {
		float imc = peso*(altura*altura);
		return imc <= 30 ? false : true;
	}
	
	protected boolean ValidacaoCardiaco() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente possui alguma doença cardíaca? ","Selecione uma das opções",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoDiabete() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente é diabético? ","Selecione uma das opções",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoRespitorio() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente possui alguma doença respiratória? ","Selecione uma das opções",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoHipertensao() {
		int valida = JOptionPane.showConfirmDialog(null, "O Paciente é hipertenso (Pressão Alta)? ","Selecione uma das opções",JOptionPane.YES_NO_OPTION);
		return valida == 0 ? false : true;
	}
	
	protected boolean ValidacaoIdade(int idade) {
		return idade < 59 ? false : true;
	}

	public boolean Validacao(Pessoa p) {
		int cont = 0;
		cont = ValidacaoIdade(p.getIdade()) ? cont++ : cont;
		cont = ValidacaoObesidade(p.getAltura(), p.getPeso()) ? cont++ : cont;
		cont = ValidacaoCardiaco() ? cont : cont++;
		cont = ValidacaoDiabete() ? cont : cont++;
		cont = ValidacaoRespitorio() ? cont : cont++;
		cont = ValidacaoHipertensao() ? cont : cont++;
		return cont == 0 ? false : true;
	}
}