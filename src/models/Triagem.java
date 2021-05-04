package models;

import java.util.ArrayList;
import java.util.Date;

public class Triagem implements Comparable<Triagem>{
	public Triagem() {
		setCriadoEm(new Date());
	}
	public Paciente paciente;
	public ArrayList<Sintoma> sintoma;
	public Recepcionista recepcionista;
	public Date criadoEm;
	public int urgencia;
	
	public int getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(int urgencia) {
		this.urgencia = urgencia;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public ArrayList<Sintoma> getSintoma() {
		return sintoma;
	}
	public void setSintoma(ArrayList<Sintoma> sintoma) {
		this.sintoma = sintoma;
	}
	public Recepcionista getRecepcionista() {
		return recepcionista;
	}
	public void setRecepcionista(Recepcionista recepcionista) {
		this.recepcionista = recepcionista;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	
	
	@Override
	public String toString() {
		return "\nPaciente: " + paciente + " | Sintomas: " + sintoma ;
	}
	
	@Override 
	public int compareTo(Triagem outraTriagem) {
		if (this.urgencia > outraTriagem.getUrgencia()) { 
			return -1; 
		}
		if (this.urgencia < outraTriagem.getUrgencia()) { 
			return 1; 
		} 
		return 0; 
	}
	
	
}
