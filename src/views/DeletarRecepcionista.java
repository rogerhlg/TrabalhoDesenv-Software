package views;

import java.util.Scanner;
import controllers.RecepcionistaController;
public class DeletarRecepcionista {
		private static Scanner sc = new Scanner(System.in);
		
		public static void renderizar() {
			System.out.println("\nInsira o CPF do recepcionista que deseja deletar: ");
			if(RecepcionistaController.Deletar(sc.next())) {
				System.out.println("\n*** Recepcionista deletado com sucesso! ***");
			}
			else 
				System.out.println("\n*** ERRO, recepcionista solicitado não existe ***");
		}
}
