package views;

import java.util.Scanner;
import controllers.PacienteController;

public class AlterarPaciente {
	private static Scanner sc = new Scanner(System.in);
	public static void renderizar() {
		int op;
		System.out.println("\n-- ALTERAR PACIENTE --  \n");
		System.out.println("Insira o CPF do paciente que deseja alterar: ");
		String cpf = sc.next();
		if(PacienteController.buscarPorCpf(cpf) != null) {
			do{
			System.out.println("\nSELECIONE A OPCAO DESEJADA PARA ALTERAR");
			System.out.println("\n1-Nome\n2-Sobrenome\n3-CPF\n0-SAIR\n");
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
			case 4:
				System.out.println("\nInsira o novo telefone:");
				break;
			case 5:
				System.out.println("\nInsira o novo email:");
				break;
			case 0:
				break;
			default:
				System.out.println("\nOpcao inexistente:");
				break;
			}
			if(op!=0) {
				PacienteController.Alterar(cpf,op,sc.next());
			}
				
				
		}while(op != 0);
		
		}
			System.out.println("\n*** ERRO, paciente solicitado não encontrado ***");
	}
}
