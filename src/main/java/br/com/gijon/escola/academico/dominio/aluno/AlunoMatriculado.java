package br.com.gijon.escola.academico.dominio.aluno;

import java.time.LocalDateTime;
import java.util.Map;

import br.com.gijon.escola.shared.dominio.CPF;
import br.com.gijon.escola.shared.dominio.evento.Evento;
import br.com.gijon.escola.shared.dominio.evento.TipoDeEvento;

public class AlunoMatriculado implements Evento{
	
	private final CPF cpfDoAluno;
	private LocalDateTime momento;
		
	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		return this.momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

	@Override
	public TipoDeEvento tipo() {
		return TipoDeEvento.ALUNO_MATRICULADO;
	}

	@Override
	public Map<String, Object> informacoes() {
		return Map.of("cpf", cpfDoAluno);
	}
	
}
