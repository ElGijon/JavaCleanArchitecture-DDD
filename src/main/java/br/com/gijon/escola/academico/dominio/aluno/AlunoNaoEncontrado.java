package br.com.gijon.escola.academico.dominio.aluno;

import br.com.gijon.escola.shared.dominio.CPF;

public class AlunoNaoEncontrado extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public AlunoNaoEncontrado(CPF cpf) {
		super("Aluno nao encontrado com CPF: " + cpf.getNumero());
	}

}
