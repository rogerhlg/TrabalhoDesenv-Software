package models;

public class Sintoma {
	
	private String nome;
	private int grauIntensidade;
	private int urgencia;
	
	public int getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(int urgencia) {
		this.urgencia = urgencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGrauIntesidade() {
		return grauIntensidade;
	}
	public void setGrauIntesidade(int grauIntesidade) {
		this.grauIntensidade = grauIntesidade;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome  + " Intensidade: " + grauIntensidade + "\n"; 
	}
}
