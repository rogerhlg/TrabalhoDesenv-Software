package controllers;

import java.util.ArrayList;


import models.Pessoa;
import models.Recepcionista;

public class RecepcionistaController {
	private static ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>(); 
	 
	public static Boolean cadastrar(Recepcionista recepcionista) {
		//VERIFICA SE O CLIENTE (CPF) JÁ ESTÁ PRESENTE NA LISTA.
		if(BuscarPorCpf(recepcionista.getPessoa().getCpf()) == null) {
			recepcionistas.add(recepcionista);
			return true;
		}
		else
			return false;
	}
	
	
	public static Recepcionista BuscarPorCpf(String cpf){
		for(Recepcionista RecepCadastrado : recepcionistas) {
			if(RecepCadastrado.getPessoa().getCpf().equals(cpf)){
				return RecepCadastrado;
			}
		}
		return null;
	}
	
	public static ArrayList<Recepcionista> Listar() {
		return recepcionistas;
	}
	
	public static Boolean Deletar(String cpf) {
		Recepcionista recepcionista = BuscarPorCpf(cpf);
		if(recepcionista != null) {
			recepcionistas.remove(recepcionista);
			return true;
		}
		else
			return false;
	}
	
	public static void Alterar(String cpf, int op, String newValue) {
		Recepcionista recepcionista = BuscarPorCpf(cpf);
		Pessoa pessoa = recepcionista.getPessoa();
		if(op==1) {
			
			pessoa.setNome(newValue);
		}
		if(op==2) {
			pessoa.setSobrenome(newValue);
			
		}
		if(op==3) {
			pessoa.setCpf(newValue);
		}
		
		recepcionista.setPessoa(pessoa);
		
	}
}
