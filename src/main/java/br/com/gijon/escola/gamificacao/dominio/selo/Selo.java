package br.com.gijon.escola.gamificacao.dominio.selo;

import br.com.gijon.escola.shared.dominio.CPF;

public class Selo {
	
	private CPF cpfDoAluno;
	private String nome;
	
	public Selo(CPF cpfDoAluno, String nome) {
		this.cpfDoAluno = cpfDoAluno;
		this.nome = nome;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

	public String getNome() {
		return nome;
	}
	
}
