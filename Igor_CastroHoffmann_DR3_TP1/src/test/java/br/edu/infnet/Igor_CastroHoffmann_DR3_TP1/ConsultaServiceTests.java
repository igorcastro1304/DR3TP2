package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Consulta;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Medico;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Paciente;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.ConsultaService;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.MedicoService;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.PacienteService;

public class ConsultaServiceTests {
	
	private ConsultaService consultaService;
	
	@BeforeEach
	void setUp() {
		consultaService = new ConsultaService();
	}
	
	@Test
	void inclusao() {
		Consulta c = new Consulta();
		c.setHorarioConsulta("10:00:00");
		consultaService.incluir(c);
		
		assertEquals(c, consultaService.obter(1));
	}
	
	@Test
	void exclusao() {
		consultaService.excluir(0);
	}
	
	@Test
	void recuperacaoGeral() {
		consultaService.obterLista();
	}
	
	@Test
	void recuperacaoUnica() {
		consultaService.obter(0);
	}
	
	@Test
	void pacienteCadastrado() {
		Paciente p = new Paciente();
		PacienteService pacienteService = new PacienteService();
		
		p.setCpf("12345678900");
		pacienteService.incluir(p);
		
		assertEquals(true, consultaService.pacienteCadastrado(p.getCpf()));
	}
	
	@Test
	void pacienteInexistente() {
		Paciente p = new Paciente();
		
		p.setCpf("12345678900");
		
		assertEquals(false, consultaService.pacienteCadastrado(p.getCpf()));
	}
	
	@Test
	void medicoCadastrado() {
		Medico m = new Medico();
		MedicoService medicoService = new MedicoService();
		
		m.setCrm(12345);
		medicoService.incluir(m);
		
		assertEquals(true, consultaService.medicoCadastrado(m.getCrm()));
	}
	
	@Test
	void medicoInexistente() {
		Medico m = new Medico();
		
		m.setCrm(11111);
		
		assertEquals(false, consultaService.medicoCadastrado(m.getCrm()));
	}
}
