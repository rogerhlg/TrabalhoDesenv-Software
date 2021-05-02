package views;

import controllers.RecepcionistaController;
import models.Recepcionista;

public class ListarRecepcionistas {
	static void renderizar(){
		for(Recepcionista RecepCadastrado : RecepcionistaController.listar()) {
			System.out.println(RecepCadastrado);
		}
	}
}
