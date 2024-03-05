package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Paciente;

public class PacienteTest {
	
	Paciente p = new Paciente();
	
	@BeforeEach
	public void setUp() {
		p.setNome(null);
		p.setCpf(null);
		p.setDataNascimento(null);
		p.setCep(0);
		p.setNumeroCasa(0);
		p.setPlanoSaude(null);
	}
	
	
	
	
	@Test
	void recuperarDados() {
		assertEquals(null, p.getNome());
		assertEquals(null, p.getCpf());
		assertEquals(null, p.getDataNascimento());
		assertEquals(0, p.getCep());
		assertEquals(0, p.getNumeroCasa());
		assertEquals(null, p.getPlanoSaude());
	}
	
}
