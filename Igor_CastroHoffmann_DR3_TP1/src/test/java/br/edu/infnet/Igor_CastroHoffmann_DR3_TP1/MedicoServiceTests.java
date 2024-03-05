package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Medico;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.MedicoService;

public class MedicoServiceTests {
	
	private MedicoService medicoService;
	
	@BeforeEach
	void setUp() {
		medicoService = new MedicoService();
	}
	
	@Test
	void inclusao() {
		Medico m = new Medico();
		
		m.setCrm(0);
		medicoService.incluir(m);
		
		assertEquals(m, medicoService.obter(0));
	}
	
	@Test
	void exclusao() {
		medicoService.excluir(0);
	}
	
	@Test
	void recuperacaoGeral() {
		medicoService.obterLista();
	}
	
	@Test
	void recuperacaoUnica() {
		medicoService.obter(0);
	}
	
	@Test
	void cadastroPacienteNovo() {
		Medico m = new Medico();
		m.setCrm(123456);
		
		assertEquals(false, medicoService.verificarCadastro(m.getCrm()));
		
	}
	
	@Test
	void cadastroPacienteExistente() {
		Medico m = new Medico();
		m.setCrm(123456);
		medicoService.incluir(m);
		
		assertEquals(true, medicoService.verificarCadastro(m.getCrm()));
		
	}
	
	
}