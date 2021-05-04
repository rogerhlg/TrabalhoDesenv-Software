  
package controllers;

import java.util.ArrayList;

import models.Endereco;
import models.Enfermeira;
import models.Pessoa;

public class EnfermeiraController {
	
	private static ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>(); 
	
	public static ArrayList<Enfermeira> listar() {
		return enfermeiras;
	}
	 
	public static Boolean cadastrar(Enfermeira enfermeira) {
		//VERIFICA SE O ENFERMEIRA (CPF) JÁ ESTÁ PRESENTE NA LISTA.
		if(buscarPorCpf(enfermeira.getPessoa().getCpf()) == null) {
			enfermeiras.add(enfermeira);
			return true;
		}
		else
			return false;
	}
	
	
	public static Enfermeira buscarPorCpf(String cpf){
		for(Enfermeira EnfermeiraCadastrada : enfermeiras) {
			if(EnfermeiraCadastrada.getPessoa().getCpf().equals(cpf)){
				return EnfermeiraCadastrada;
			}
		}
		return null;
	}
	
	public static Boolean deletar(String cpf) {
		Enfermeira enfermeira = buscarPorCpf(cpf);
		if(enfermeira != null) {
			enfermeiras.remove(enfermeira);
			return true;
		}
		return false;
	}
	
	public static void alterar(String cpf, int op, String newValue) {
		Enfermeira enfermeira = buscarPorCpf(cpf);
		Pessoa pessoa = enfermeira.getPessoa();
		Endereco endereco = enfermeira.getPessoa().getEndereco();
		if(op==1)
			pessoa.setNome(newValue);
		if(op==2)
			pessoa.setSobrenome(newValue);
		if(op==3)
			pessoa.setCpf(newValue);
		if(op==5)
			pessoa.setTelefone(newValue);
		if(op==6)
			pessoa.setEmail(newValue);
		if(op==7)
			endereco.setLogradouro(newValue);
		if(op==8)
			endereco.setNumero(newValue);
		if(op==9)
			endereco.setBairro(newValue);
		if(op==10)
			endereco.setCidade(newValue);
		if(op==11)
			endereco.setCep(newValue);
		
		enfermeira.setPessoa(pessoa);
	}
	
	public static void alterar(String cpf, int op, int newValue) {
		Enfermeira enfermeira = buscarPorCpf(cpf);
		Pessoa pessoa = enfermeira.getPessoa();
		if(op==4)
			pessoa.setIdade(newValue);
		
		enfermeira.setPessoa(pessoa);
	}
}