package br.com.gijon.escola.academico.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.gijon.escola.academico.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new Email(null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new Email(""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new Email("emailinvalido"));
	}

}
