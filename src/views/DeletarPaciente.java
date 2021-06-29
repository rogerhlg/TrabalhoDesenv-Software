package views;

import java.util.Scanner;
import controllers.PacienteController;

public class DeletarPaciente {
	private static Scanner sc = new Scanner(System.in);
	private static PacienteController controller2 = PacienteController.retornarInstancia();
	
	public static void renderizar() {
		System.out.println("\n-- DELETAR PACIENTE --  \n");
		System.out.println("Insira o CPF do paciente que deseja deletar: ");
		if(controller2.deletar(sc.next())) {
			System.out.println("\n*** Paciente deletado com sucesso! ***");
		}
		else 
			System.out.println("\n*** ERRO, paciente solicitado não existe ***");
	}
}
