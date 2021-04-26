package views;

import controllers.RecepcionistaController;
import models.Recepcionista;

public class ListarRecepcionistas {
	static void renderizar(){
		
		for(Recepcionista RecepCadastrado : RecepcionistaController.Listar()) {
			System.out.println(RecepCadastrado);
		}
	}
}
