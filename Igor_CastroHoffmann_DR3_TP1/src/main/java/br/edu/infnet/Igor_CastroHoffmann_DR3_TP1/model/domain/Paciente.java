package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain;

import java.util.Scanner;

public class Paciente extends Pessoa {
	
	Scanner in = new Scanner(System.in);
	
	private String planoSaude;
	
	
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	@Override
	public String toString() {
	    return "[Nome: " + getNome() + ", CPF: " + getCpf() + ", Data de Nascimento: " + getDataNascimento() + ", CEP: " + getCep() + ", Número da Casa: " + getNumeroCasa() + "]";
	}
}