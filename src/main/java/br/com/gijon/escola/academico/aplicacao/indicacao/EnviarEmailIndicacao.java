package br.com.gijon.escola.academico.aplicacao.indicacao;

import br.com.gijon.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);
	
}
