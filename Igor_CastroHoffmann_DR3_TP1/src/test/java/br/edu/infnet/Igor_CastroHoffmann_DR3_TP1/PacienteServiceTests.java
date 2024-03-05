package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Paciente;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.PacienteService;

public class PacienteServiceTests {
	
	private PacienteService pacienteService;
	
	@BeforeEach
	void setUp() {
		pacienteService = new PacienteService();
	}
	
	@Test
	void inclusao() {
		Paciente p = new Paciente();
		
		p.setCpf(null);
		pacienteService.incluir(p);
		
		assertEquals(p, pacienteService.obter(null));
	}
	
	@Test
	void exclusao() {
		pacienteService.excluir(null);
	}
	
	@Test
	void recuperacaoGeral() {
		pacienteService.obterLista();
	}
	
	@Test
	void recuperacaoUnica() {
		pacienteService.obter(null);
	}
	
	@Test
	void cadastroPacienteNovo() {
		Paciente p = new Paciente();
		p.setCpf("00011122233");
		
		assertEquals(false, pacienteService.verificarCadastro(p.getCpf()));
		
	}
	
	@Test
	void cadastroPacienteExistente() {
		Paciente p = new Paciente();
		p.setCpf("00011122233");
		pacienteService.incluir(p);
		
		assertEquals(true, pacienteService.verificarCadastro(p.getCpf()));
		
	}
	
	
}
