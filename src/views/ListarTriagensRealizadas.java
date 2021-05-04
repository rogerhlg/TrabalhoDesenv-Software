package views;

import models.Triagem;
import controllers.TriagemController;

public class ListarTriagensRealizadas {

	public static void listarTriagens(){
		System.out.println("\n-- LISTA DE TRIAGENS REALIZADAS --  \n");
		for(Triagem triagens : TriagemController.listarTriagens()) {
			System.out.println(triagens);
		}
	}
}
