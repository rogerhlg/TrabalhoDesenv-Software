package models;

import java.util.ArrayList;


public class Consultorio {
	private String nome;
	private String andar;
	private Boolean disponibilidade;
	private Paciente paciente;
	
	public String getNome() {
		return andar+nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}
	public Boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@Override
	public String toString() {
		return "Consultorio [nome=" + nome + ", andar=" + andar + ", paciente="
				+ paciente.getNome() + "]";
	}

	
}
