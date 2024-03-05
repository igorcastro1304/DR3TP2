package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Consulta;

public class ConsultaService {
	
	Scanner in = new Scanner(System.in);
	
	int contador = 1;
	
	private static Map<Integer, Consulta> consultas = new HashMap<Integer, Consulta>();
	
	private PacienteService pacienteService = new PacienteService();
	private MedicoService medicoService = new MedicoService();
	
	public void incluir(Consulta consulta) {
		
		consultas.put(contador, consulta);
		contador++;
		
	}
	
	public void excluir(int numeroConsulta) {
		consultas.remove(numeroConsulta);
	}
	
	public Collection<Consulta> obterLista(){
		return consultas.values();
	}
	
	public Consulta obter(int numeroConsulta) {
		return consultas.get(numeroConsulta);
	}
	
	public void agendarConsulta() {
		Consulta c = new Consulta();
		
		String cpf;
		int crm;
		
		System.out.print("Qual o CPF do Paciente? ");
		cpf = in.next();
		
		if(!pacienteCadastrado(cpf)) {
			System.out.println("Paciente não cadastrado! Por favor, cadastre o paciente.");
			System.out.println();
			return;
		}
		c.setPaciente(pacienteService.obter(cpf));
		
		System.out.println("Qual o CRM do médico? ");
		crm = in.nextInt();
		if(!medicoCadastrado(crm)) {
			System.out.println("Médico não cadastrado! Por favor, cadastre o médico.");
			System.out.println();
			return;
		}
		c.setMedico(medicoService.obter(crm));

		System.out.println("Qual o horário da consulta? ");
		c.setHorarioConsulta(in.next());
		
		incluir(c);
		
		System.out.println("Consulta agendada com sucesso!\n" + c);
		System.out.println();
	}
	
	public boolean pacienteCadastrado(String cpf) {
		if(pacienteService.obter(cpf) == null) {
			return false;
		}
		return true;
	}
	
	public boolean medicoCadastrado(int crm) {
		if(medicoService.obter(crm) == null) {
			return false;
		}
		return true;
	}
}
