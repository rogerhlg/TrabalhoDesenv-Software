package views;

import controllers.EnfermeiraController;
import models.Enfermeira;

public class ListarEnfermeiras {
	private static EnfermeiraController controller = EnfermeiraController.retornarInstancia();

	static void renderizar(){
		System.out.println("\n-- LISTA DE ENFERMEIRAS --  \n");
		for(Enfermeira EnfermeiraCadastrada : controller.listar()) {
			System.out.println(EnfermeiraCadastrada);
		}
	}
}
