package controllers;

import models.Paciente;

public interface IFilaTriagemController {

	boolean adicionar(Paciente paciente);

	boolean remover();

	Paciente proximo();

	void listar();

}