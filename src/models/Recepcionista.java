package models;

import java.util.Date;

public class Recepcionista {
	private Pessoa pessoa;
	private String credencial;
	private Date criadoEm;
	private Boolean estaAtivo;
	
	public Recepcionista(Pessoa pessoa) {
		this.criadoEm = new Date();
		this.estaAtivo = true;
		this.pessoa = pessoa;
	}
	
	public Boolean getEstaAtivo() {
		return estaAtivo;
	}
	public void setEstaAtivo(Boolean estaAtivo) {
		this.estaAtivo = estaAtivo;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getCredencial() {
		return credencial;
	}
	public void setCredencial(String credencial) {
		this.credencial = credencial;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	
	
}
