package views;

import controllers.EnfermeiraController;
import models.Enfermeira;

public class ListarEnfermeiras {
	static void renderizar(){
		System.out.println("\n-- LISTA DE ENFERMEIRAS --  \n");
		for(Enfermeira EnfermeiraCadastrada : EnfermeiraController.listar()) {
			System.out.println(EnfermeiraCadastrada);
		}
	}
}
