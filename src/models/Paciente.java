package models;

import java.util.Date;

public class Paciente {

	public Paciente() {
		this.criadoEm = new Date();
	}

	private Date criadoEm;
	private Pessoa pessoa;

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return pessoa + " | Criado em: " + criadoEm;
	}

}