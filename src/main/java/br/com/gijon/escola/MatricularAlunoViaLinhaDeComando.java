package br.com.gijon.escola;

import br.com.gijon.escola.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.gijon.escola.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.gijon.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.gijon.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.gijon.escola.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.gijon.escola.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.gijon.escola.shared.dominio.evento.PublicadorDeEventos;

public class MatricularAlunoViaLinhaDeComando {

	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";
		
		MatricularAlunoDto dto = new MatricularAlunoDto(
				nome, cpf, email);
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		publicador.adicionar(new GeraSeloAlunoNovato(new RepositorioDeSelosEmMemoria()));
		
		MatricularAluno matricular = new MatricularAluno(
				new RepositorioDeAlunosEmMemoria(), publicador);
		
		matricular.executa(dto);
	}

}
