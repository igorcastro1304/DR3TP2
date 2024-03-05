package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Consulta;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Paciente;

public class ConsultaTests {
	
	Consulta c = new Consulta();
	
	@BeforeEach
	public void setUp() {
		c.setPaciente(null);
		c.setMedico(null);
		c.setHorarioConsulta(null);
	}
	
	
	
	
	@Test
	void recuperarDados() {
		assertEquals(null, c.getPaciente());
		assertEquals(null, c.getMedico());
		assertEquals(null, c.getHorarioConsulta());
	}
	
	
}
