package views;

import controllers.PacienteController;
import models.Paciente;

public class ListarPacientes {
	private static PacienteController controller2 = PacienteController.retornarInstancia();
	
	public static void renderizar() {
		System.out.println("\n-- LISTA DE PACIENTES --  \n");
		for(Paciente pacienteCadastrado : controller2.listar()) {
			System.out.println(pacienteCadastrado);
		}
	}

}