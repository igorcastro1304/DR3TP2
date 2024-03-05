package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Medico;

public class MedicoTests {
	Medico m = new Medico();
	
	@BeforeEach
	public void setUp() {
		m.setNome(null);
		m.setCrm(0);
		m.setEspecialidade(null);
		m.setCpf(null);
		m.setDataNascimento(null);
		m.setCep(0);
		m.setNumeroCasa(0);
	}
	
	
	
	
	@Test
	void recuperarDados() {
		assertEquals(null, m.getNome());
		assertEquals(0, m.getCrm());
		assertEquals(null, m.getEspecialidade());
		assertEquals(null, m.getCpf());
		assertEquals(null, m.getDataNascimento());
		assertEquals(0, m.getCep());
		assertEquals(0, m.getNumeroCasa());
	}
}
