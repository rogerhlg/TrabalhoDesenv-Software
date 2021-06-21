package models;

public class Enfermeira extends Pessoa{
	private Boolean estaAtivo;
	
	public Enfermeira() {
		this.estaAtivo = true;
	}
	
	public Boolean getEstaAtivo() {
		return estaAtivo;
	}
	
	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	
}