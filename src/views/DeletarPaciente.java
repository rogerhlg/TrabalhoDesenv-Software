package views;

import java.util.Scanner;
import controllers.PacienteController;

public class DeletarPaciente {
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		System.out.println("\n-- DELETAR PACIENTE --  \n");
		System.out.println("Insira o CPF do paciente que deseja deletar: ");
		if(PacienteController.deletar(sc.next())) {
			System.out.println("\n*** Paciente deletado com sucesso! ***");
		}
		else 
			System.out.println("\n*** ERRO, paciente solicitado não existe ***");
	}
}
