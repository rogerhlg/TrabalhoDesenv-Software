package controllers;

import java.util.ArrayList;

import models.Endereco;
import models.Paciente;

public class PacienteController implements IPacienteController {
	
	//Singleton
	private static PacienteController controller;	
	public static  PacienteController retornarInstancia() {
		if(controller  == null) {
			controller = new PacienteController();
		}
		return controller;
	}

	private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>(); 

	@Override
	public ArrayList<Paciente> listar() {
		return pacientes;
	}
	
	@Override
	public boolean cadastrar(Paciente paciente) {
		if(buscarPorCpf(paciente.getCpf()) == null) {
			pacientes.add(paciente);
			return true;
		}
		return false;
	}	
	
	@Override
	public Paciente buscarPorCpf(String cpf) {
		for(Paciente pacienteCadastrado : pacientes) {
			if(pacienteCadastrado.getCpf().equals(cpf)) {
				return pacienteCadastrado;
			}
		}	
		return null;
	}
	
	@Override
	public Boolean deletar(String cpf) {
		Paciente paciente = buscarPorCpf(cpf);
		if(paciente != null) {
			pacientes.remove(paciente);
			return true;
		}
		return false;
	}
	
	@Override
	public void alterar(String cpf, int op, String newValue) {
		Paciente paciente = buscarPorCpf(cpf);
		Endereco endereco = paciente.getEndereco();
		if(op==1)
			paciente.setNome(newValue);
		if(op==2)
			paciente.setSobrenome(newValue);
		if(op==3)
			paciente.setCpf(newValue);
		if(op==5)
			paciente.setTelefone(newValue);
		if(op==6)
			paciente.setEmail(newValue);
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
	
	@Override
	public void alterar(String cpf, int op, int newValue) {
		Paciente paciente = buscarPorCpf(cpf);
		if(op==4)
			paciente.setIdade(newValue);
		
		/*
		 * paciente.setPessoa(pessoa);
		 */		
	}
	
}