package views;

import java.util.Scanner;

import controllers.RecepcionistaController;

public class AlterarRecepcionista {
	private static Scanner sc = new Scanner(System.in);
	public static void renderizar() {
		int op;
		System.out.println("\nInsira o CPF do recepcionista que deseja ALTERAR: ");
		String cpf = sc.next();
		if(RecepcionistaController.BuscarPorCpf(cpf) != null) {
			do{
			System.out.println("SELECIONE A OPCAO DESEJADA PARA ALTERAR");
			System.out.println("\n1-Nome\n2-Sobrenome\n3CPF-\n0-SAIR\n");
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("\nInsira o novo nome:");
				break;
			case 2:
		
				System.out.println("\nInsira o novo sobrenome:");
				break;

			case 3:
				System.out.println("\nInsira o novo CPF:");
				break;
			
			case 0:
				break;
			
			default:
				System.out.println("\nOpcao inexistente:");
				break;
			}
			if(op!=0)
			RecepcionistaController.Alterar(cpf,op,sc.next());
		}while(op != 0);
		
		}
		else 
			System.out.println("\n*** ERRO, recepcionista solicitado não encontrado ***");
	}
}
