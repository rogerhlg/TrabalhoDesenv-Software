package models;

import java.util.ArrayList;


public class Consultorio {
	private String nome;
	private String andar;
	private String maca;
	private Boolean disponibilidade;
	
	public String getNome() {
		return nome;
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
	public String getMaca() {
		return maca;
	}
	public void setMaca(String maca) {
		this.maca = maca;
	}
	
	public Boolean getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(Boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@Override
	public String toString() {
		return "Consultorio [nome=" + nome + ", andar=" + andar + ", maca=" + maca + "]";
	}
}
