package views;

import controllers.PacienteController;
import models.Paciente;

public class ListarPacientes {
	
	public static void renderizar() {
		System.out.println("\n-- LISTAR PACIENTES --  \n");
		for(Paciente pacienteCadastrado : PacienteController.listar()) {
			System.out.println(pacienteCadastrado);
		}
	}

}