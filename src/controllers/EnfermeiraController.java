  
package controllers;

import java.util.ArrayList;

import models.Endereco;
import models.Enfermeira;

public class EnfermeiraController {
	
	private static ArrayList<Enfermeira> enfermeiras = new ArrayList<Enfermeira>(); 
	
	public static ArrayList<Enfermeira> listar() {
		return enfermeiras;
	}
	 
	public static Boolean cadastrar(Enfermeira enfermeira) {
		//VERIFICA SE O ENFERMEIRA (CPF) JÁ ESTÁ PRESENTE NA LISTA.
		if(buscarPorCpf(enfermeira.getCpf()) == null) {
			enfermeiras.add(enfermeira);
			return true;
		}
		else
			return false;
	}
	
	
	public static Enfermeira buscarPorCpf(String cpf){
		for(Enfermeira EnfermeiraCadastrada : enfermeiras) {
			if(EnfermeiraCadastrada.getCpf().equals(cpf)){
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
		Endereco endereco = enfermeira.getEndereco();
		if(op==1)
			enfermeira.setNome(newValue);
		if(op==2)
			enfermeira.setSobrenome(newValue);
		if(op==3)
			enfermeira.setCpf(newValue);
		if(op==4)
			enfermeira.setIdade(Integer.parseInt(newValue));
		if(op==5)
			enfermeira.setTelefone(newValue);
		if(op==6)
			enfermeira.setEmail(newValue);
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
	}
	
	/*
	 * public static void alterar(String cpf, int op, int newValue) { Enfermeira
	 * enfermeira = buscarPorCpf(cpf); Pessoa pessoa = enfermeira.getPessoa();
	 * if(op==4) pessoa.setIdade(newValue);
	 * 
	 * enfermeira.setPessoa(pessoa); }
	 */
}