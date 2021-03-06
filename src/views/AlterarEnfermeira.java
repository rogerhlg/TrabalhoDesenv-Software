package views;

import java.util.Scanner;

import controllers.EnfermeiraController;
import utils.Console;

public class AlterarEnfermeira {
	private static Scanner sc = new Scanner(System.in);
	private static EnfermeiraController controller = EnfermeiraController.retornarInstancia();

	public static void renderizar() {
		int op;
		System.out.println("\nInsira o CPF da enfermeira que deseja ALTERAR: ");
		String cpf = sc.next();
		if(controller.buscarPorCpf(cpf) != null) {
			do{
			System.out.println("\nSELECIONE A OPCAO DESEJADA PARA ALTERAR");
			System.out.println("\n1- Nome"
					+ "			\n2- Sobrenome"
					+ "			\n3- CPF"
					+ "			\n4- Idade"
					+ "			\n5- Telefone"
					+ "			\n6- Email"
					+ "			\n7- Logradouro"
					+ "			\n8- Numero"
					+ "			\n9- Bairro"
					+ "			\n10- Cidade"
					+ "			\n11- CEP"
					+ "			\n0- VOLTAR\n");
			op = Console.lerInteiro("Insira a opcao desejada: ");
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
				System.out.println("\nInsira a nova idade:");
				break;
				
			case 5:
				System.out.println("\nInsira o novo telefone:");
				break;
				
			case 6:
				System.out.println("\nInsira o novo email:");
				break;
				
			case 7:
				System.out.println("\nInsira o novo logradouro:");
				break;
				
			case 8:
				System.out.println("\nInsira o novo n?mero (endere?o):");
				break;
				
			case 9:
				System.out.println("\nInsira o novo bairro:");
				break;
				
			case 10:
				System.out.println("\nInsira a nova cidade:");
				break;
				
			case 11:
				System.out.println("\nInsira o novo CEP:");
				break;
			
			case 0:
				break;
			
			default:
				System.out.println("\nOp??o inexistente!");
				break;
			}
			if(op!=0)
			controller.alterar(cpf,op,sc.next());
			
			}while(op != 0);
		
			System.out.println("\nAlterado com sucesso!\n");
		}
		else 
			System.out.println("\n**ERRO** Enfermeira solicitada, n?o encontrada!");
	}
}
