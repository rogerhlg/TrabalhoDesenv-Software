package views;

import controllers.PacienteController;
import models.Paciente;

public class CadastrarPaciente {

	private static Paciente paciente;	
	
	public static void renderizar() {
		paciente = new Paciente();
		System.out.println("\n-- CADASTRAR PACIENTE --  \n");
		paciente.setPessoa(CadastrarPessoa.renderizar());
		if(PacienteController.cadastrar(paciente)) {
			System.out.println("\nPaciente cadastrado com sucesso!");
		}else {
			System.out.println("Esse Paciente já está cadastrado!");
		}
	}
}