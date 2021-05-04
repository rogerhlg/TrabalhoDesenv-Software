package views;

import java.util.Scanner;
import controllers.EnfermeiraController;

public class DeletarEnfermeira {
		private static Scanner sc = new Scanner(System.in);
		
		public static void renderizar() {
			System.out.println("\nInsira o CPF da enfermeira que deseja deletar: ");
			if(EnfermeiraController.deletar(sc.next())) {
				System.out.println("\n*** Enfermeira deletada com sucesso! ***");
			}
			else 
				System.out.println("\n*** ERRO, enfermeira solicitada não existe ***");
		}
}
