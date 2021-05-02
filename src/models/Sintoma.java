package models;

public class Sintoma {
	
	private String nome;
	private int grauIntensidade;
	
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
		return "\nNome: " + nome + " " + grauIntensidade + "(Intensidade)";
	}
}
