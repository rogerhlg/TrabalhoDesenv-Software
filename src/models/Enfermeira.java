package models;

import java.util.Date;

public class Enfermeira {
	private Pessoa pessoa;
	private Date criadoEm;
	private Boolean estaAtivo;
	private String matriculaFuncionario;
	
	public Enfermeira() {
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
	
	public String getMatriculaFuncionario() {
		return matriculaFuncionario;
	}

	public void setMatriculaFuncionario(String matriculaFuncionario) {
		this.matriculaFuncionario = matriculaFuncionario;
	}

	@Override
	public String toString() {
		return "Matrícula: " + matriculaFuncionario + " | " + pessoa + " | Criado em: " + criadoEm;
	}
	
}
