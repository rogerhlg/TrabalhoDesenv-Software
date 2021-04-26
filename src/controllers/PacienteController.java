package controllers;

import java.util.ArrayList;
import models.Paciente;
import models.Pessoa;

public class PacienteController {

	private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>(); 

	public static ArrayList<Paciente> listar() {
		return pacientes;
	}
	
	public static boolean cadastrar(Paciente paciente) {
		if(buscarPorCpf(paciente.getPessoa().getCpf()) == null) {
			pacientes.add(paciente);
			return true;
		}
		return false;
	}	
	
	public static Paciente buscarPorCpf(String cpf) {
		for(Paciente pacienteCadastrado : pacientes) {
			if(pacienteCadastrado.getPessoa().getCpf().equals(cpf)) {
				return pacienteCadastrado;
			}
		}	
		return null;
	}
	
	public static Boolean Deletar(String cpf) {
		Paciente paciente = buscarPorCpf(cpf);
		if(paciente != null) {
			pacientes.remove(paciente);
			return true;
		}
			return false;
	}
	
	public static void Alterar(String cpf, int op, String newValue) {
		Paciente paciente = buscarPorCpf(cpf);
		Pessoa pessoa = paciente.getPessoa();
		if(op==1) {
			pessoa.setNome(newValue);
		}
		if(op==2) {
			pessoa.setSobrenome(newValue);
		}
		if(op==3) {
			pessoa.setCpf(newValue);
		}
		paciente.setPessoa(pessoa);
	}
	
}