package models;

import java.util.Date;

public abstract class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private int idade;
	private Endereco endereco;
	private String telefone;
	private String email;
	private Date criadoEm;
	
	public Pessoa() {
		this.criadoEm = new Date();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | Sobrenome: " + sobrenome + " | CPF: " + cpf + " | Idade: " + idade + " | Telefone: " + telefone + " | Email: " + email + " | " + endereco + " | Criado em: " + criadoEm;
	}

	
}
