package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Medico;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Medico;

public class MedicoService {
	
	Scanner in = new Scanner(System.in);
	
	private static Map<Integer, Medico> medicos = new HashMap<Integer, Medico>();
	
	public void incluir(Medico medico) {
		medicos.put(medico.getCrm(), medico);
	}
	
	public void excluir(int crm) {
		medicos.remove(crm);
	}
	
	public Collection<Medico> obterLista(){
		return medicos.values();
	}
	
	public Medico obter(int crm) {
		return medicos.get(crm);
	}
	
	public void cadastrarMedico() {
		
		Medico m = new Medico();
		
		System.out.println("Qual o nome do médico? ");
		m.setNome(in.next());
		
		System.out.println("Qual o CRM do médico? ");
		m.setCrm(in.nextInt());
		
		if(verificarCadastro(m.getCrm())) {
			System.out.println("Médico já cadastrado!");
			System.out.println();
			System.out.println();
			return;
		}
		
		System.out.println("Qual a especialidade do médico? ");
		m.setEspecialidade(in.next());
		
		System.out.println("Qual o CPF do médico? ");
		m.setCpf(in.next());
		
		System.out.println("Qual a data de nascimento?");
		m.setDataNascimento(in.next());
		
		System.out.println("Qual o CEP? ");
		m.setCep(in.nextInt());
		
		System.out.println("Qual o número da casa? ");
		m.setNumeroCasa(in.nextInt());
		
		incluir(m);
		
		System.out.println("Medico adicionado com sucesso!\n" + m);
		System.out.println();
		
	}
	
	public boolean verificarCadastro(int crm) {
		return medicos.containsKey(crm);
	}
}
