package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.ConsultaService;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.MedicoService;
import br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.service.PacienteService;

@SpringBootApplication
public class IgorCastroHoffmannDr3Tp1Application {
	
	public static void menu() {
		int opcao = 0;
		
		Scanner in = new Scanner(System.in);
		
		ConsultaService consultaService = new ConsultaService();
		PacienteService pacienteService = new PacienteService();
		MedicoService medicoService = new MedicoService();
		
		do {
			System.out.println("Olá! Seja bem-vindo(a) ao Minha Clinica. Selecione uma das opções: ");
			System.out.println();
			System.out.println("1 - Agendar Consulta\n2 - Cadastrar Paciente\n3 - Cadastrar Médico\n4 - Sair");
			System.out.println();
			System.out.print("Escolha uma opção: ");
			opcao = in.nextInt();
			
			switch(opcao) {
			case 1:
				consultaService.agendarConsulta();
				break;
				
			case 2:
				pacienteService.cadastrarPaciente();
				break;
			
			case 3:
				medicoService.cadastrarMedico();
				break;
				
			case 4:
				break;
			
			default:
				System.out.println("Erro");
				break;
			}
			
		} while(opcao != 4);
		
		in.close();
	}

	public static void main(String[] args) {
		SpringApplication.run(IgorCastroHoffmannDr3Tp1Application.class, args);
		
		menu();
	}
}
