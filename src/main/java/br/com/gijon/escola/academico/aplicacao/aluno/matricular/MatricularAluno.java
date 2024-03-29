	package br.com.gijon.escola.academico.aplicacao.aluno.matricular;

import br.com.gijon.escola.academico.dominio.aluno.Aluno;
import br.com.gijon.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.gijon.escola.academico.dominio.aluno.RepositorioDeAlunos;
import br.com.gijon.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAluno{
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEventos publicador;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		
		AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
		publicador.publicar(evento);
		
	}

}
