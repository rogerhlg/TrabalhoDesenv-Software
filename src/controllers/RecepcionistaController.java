  
package controllers;

import java.util.ArrayList;

import models.Endereco;
import models.Pessoa;
import models.Recepcionista;

public class RecepcionistaController {
	
	private static ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>(); 
	
	public static ArrayList<Recepcionista> listar() {
		return recepcionistas;
	}
	 
	public static Boolean cadastrar(Recepcionista recepcionista) {
		//VERIFICA SE O RECEPCIONISTA (CPF) JÁ ESTÁ PRESENTE NA LISTA.
		if(buscarPorCpf(recepcionista.getPessoa().getCpf()) == null) {
			recepcionistas.add(recepcionista);
			return true;
		}
		else
			return false;
	}
	
	
	public static Recepcionista buscarPorCpf(String cpf){
		for(Recepcionista RecepCadastrado : recepcionistas) {
			if(RecepCadastrado.getPessoa().getCpf().equals(cpf)){
				return RecepCadastrado;
			}
		}
		return null;
	}
	
	public static Boolean deletar(String cpf) {
		Recepcionista recepcionista = buscarPorCpf(cpf);
		if(recepcionista != null) {
			recepcionistas.remove(recepcionista);
			return true;
		}
		return false;
	}
	
	public static void alterar(String cpf, int op, String newValue) {
		Recepcionista recepcionista = buscarPorCpf(cpf);
		Pessoa pessoa = recepcionista.getPessoa();
		Endereco endereco = recepcionista.getPessoa().getEndereco();
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
		
		recepcionista.setPessoa(pessoa);
	}
	
	public static void alterar(String cpf, int op, int newValue) {
		Recepcionista recepcionista = buscarPorCpf(cpf);
		Pessoa pessoa = recepcionista.getPessoa();
		if(op==4)
			pessoa.setIdade(newValue);
		
		recepcionista.setPessoa(pessoa);
	}
}