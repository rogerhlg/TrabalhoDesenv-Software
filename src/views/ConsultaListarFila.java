package views;

import java.util.ArrayList;

import controllers.TriagemController;
import models.Triagem;

public class ConsultaListarFila {
	
	public static void renderizarFila(){
		ArrayList<Triagem> filaConsulta = TriagemController.listar();
		if( filaConsulta != null ) {
			System.out.println("\n***FILA DA CONSULTA ***\n" + filaConsulta);
		}
		else
			System.out.println("\n***Fila vazia!***");
	}
	
	public static void renderizarNextPaciente(){
		Triagem proxPaciente = TriagemController.proxPaciente();
		if( proxPaciente != null ) {
			System.out.println("\n***Proximo paciente:  ***\n" + proxPaciente);
		}
		else
			System.out.println("\n***Fila vazia!***");
	}
}
