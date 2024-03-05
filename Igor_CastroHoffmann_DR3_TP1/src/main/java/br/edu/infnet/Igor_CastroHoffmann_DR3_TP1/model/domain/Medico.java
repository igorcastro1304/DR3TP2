package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain;

public class Medico extends Pessoa{
	private int crm;
	private String especialidade;
	
	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public String toString() {
		return "[Nome do Médico: " + getNome() + ", CRM: " + getCrm() + ", Especialidade: " + getEspecialidade() + ", CPF: " + getCpf() + ", Data de Nascimento: " + getDataNascimento() + ", CEP: " + getCep() + ", Número da Casa: " + getNumeroCasa() + "]";
	}
	
}