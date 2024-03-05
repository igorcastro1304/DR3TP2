package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain.Paciente;

public class PacienteService {
	
	Scanner in = new Scanner(System.in);
	
	private static Map<String, Paciente> pacientes = new HashMap<String, Paciente>();
	
	public void incluir(Paciente paciente) {
		pacientes.put(paciente.getCpf(), paciente);
	}
	
	public void excluir(String cpf) {
		pacientes.remove(cpf);
	}
	
	public Collection<Paciente> obterLista(){
		return pacientes.values();
	}
	
	public Paciente obter(String cpf) {
		return pacientes.get(cpf);
	}
	
	public void cadastrarPaciente() {
		
		Paciente p = new Paciente();
		
		System.out.println("Qual o nome do paciente? ");
		p.setNome(in.next());
		
		System.out.println("Qual o CPF do paciente? ");
		p.setCpf(in.next());
		
		if(verificarCadastro(p.getCpf())) {
			System.out.println("Paciente já cadastrado!");
			System.out.println();
			System.out.println();
			return;
		}
		
		
		System.out.println("Qual a data de nascimento?");
		p.setDataNascimento(in.next());
		
		System.out.println("Qual o CEP? ");
		p.setCep(in.nextInt());
		
		System.out.println("Qual o número da casa? ");
		p.setNumeroCasa(in.nextInt());
		
		incluir(p);
		
		System.out.println("Paciente adicionado com sucesso!\n" + p);
		System.out.println();
		
	}
	
	public boolean verificarCadastro(String cpf) {
		return pacientes.containsKey(cpf);
	}
}
