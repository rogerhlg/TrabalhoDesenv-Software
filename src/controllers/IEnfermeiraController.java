package controllers;

import java.util.ArrayList;

import models.Enfermeira;

public interface IEnfermeiraController {

	ArrayList<Enfermeira> listar();

	Boolean cadastrar(Enfermeira enfermeira);

	Enfermeira buscarPorCpf(String cpf);

	Boolean deletar(String cpf);

	void alterar(String cpf, int op, String newValue);

}