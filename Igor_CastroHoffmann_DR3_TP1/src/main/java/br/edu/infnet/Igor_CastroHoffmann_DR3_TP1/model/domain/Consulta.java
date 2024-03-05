package br.edu.infnet.Igor_CastroHoffmann_DR3_TP1.model.domain;

public class Consulta {
	
	private Paciente paciente;
	private Medico medico;
	private String horarioConsulta;
	
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente nomePaciente) {
		this.paciente = nomePaciente;
	}
	
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico nomeMedico) {
		this.medico = nomeMedico;
	}
	
	public String getHorarioConsulta() {
		return horarioConsulta;
	}
	public void setHorarioConsulta(String horarioConsulta) {
		this.horarioConsulta = horarioConsulta;
	}
	
	@Override
	public String toString() {
		return "[Nome do Paciente: " + paciente.getNome() + "\n Nome do médico: " + medico.getNome() + "\n Especialidade: " + medico.getEspecialidade() + "\n Horário da Consulta: " + getHorarioConsulta() + "]";
	}
	
}
