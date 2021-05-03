package views;
import models.Paciente;
import controllers.FilaTriagemController;

public class FilaTriagem {
	
	private static Paciente nextPaciente;
	
	public static void proximo(){
		
		nextPaciente = new Paciente();
		
		nextPaciente = FilaTriagemController.proximo();
		if (nextPaciente != null) {
			System.out.println("\n" + nextPaciente);
		}else {
			System.out.println("\nFila vazia!");
		}
	}
	
	public static void listar(){
		
		nextPaciente = new Paciente();
		
		FilaTriagemController.listar();

	}
	
}
