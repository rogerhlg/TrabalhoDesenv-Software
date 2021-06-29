package controllers;

import java.util.ArrayList;

import models.Paciente;

public interface IPacienteController {

	ArrayList<Paciente> listar();

	boolean cadastrar(Paciente paciente);

	Paciente buscarPorCpf(String cpf);

	Boolean deletar(String cpf);

	void alterar(String cpf, int op, String newValue);

	void alterar(String cpf, int op, int newValue);

}