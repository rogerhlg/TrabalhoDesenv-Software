package models;

import java.util.Date;

public class Recepcionista {
	private Pessoa pessoa;
	private Date criadoEm;
	private Boolean estaAtivo;
	
	public Recepcionista() {
		this.criadoEm = new Date();
		this.estaAtivo = true;
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

	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return pessoa + " | Criado em: " + criadoEm;
	}
	
}
