package models;

public class Triagem {
	public int idTriagem;
	public int idPaciente;
	public String Sintomas;
	public int Grau_urgencia;
	public int getIdTriagem() {
		return idTriagem;
	}
	public void setIdTriagem(int idTriagem) {
		this.idTriagem = idTriagem;
	}
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getSintomas() {
		return Sintomas;
	}
	public void setSintomas(String sintomas) {
		Sintomas = sintomas;
	}
	public int getGrau_urgencia() {
		return Grau_urgencia;
	}
	public void setGrau_urgencia(int grau_urgencia) {
		Grau_urgencia = grau_urgencia;
	}
	
}
