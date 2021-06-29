package views;
import models.Paciente;
import controllers.FilaTriagemController;

public class FilaTriagem {
	
	private static Paciente nextPaciente;
	private static FilaTriagemController controller = FilaTriagemController.retornarInstancia();
	
	public static void proximo(){
		
		nextPaciente = new Paciente();
		
		nextPaciente = controller.proximo();
		if (nextPaciente != null) {
			System.out.println("\n" + nextPaciente);
		}else {
			System.out.println("\nFila vazia!");
		}
	}
	
	public static void listar(){
		
		controller.listar();

	}
	
}
