package views;

import java.util.Scanner;

import controllers.RecepcionistaController;

public class AlterarRecepcionista {
	private static Scanner sc = new Scanner(System.in);
	public static void renderizar() {
		int op;
		System.out.println("\nInsira o CPF do recepcionista que deseja ALTERAR: ");
		String cpf = sc.next();
		if(RecepcionistaController.buscarPorCpf(cpf) != null) {
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
				System.out.println("\nInsira a nova idade:");
				RecepcionistaController.alterar(cpf,op,sc.nextInt());
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
				System.out.println("\nInsira o novo número (endereço):");
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
				System.out.println("\nOpção inexistente!");
				break;
			}
			if(op!=0 && op!= 4)
			RecepcionistaController.alterar(cpf,op,sc.next());
			
			}while(op != 0);
		
			System.out.println("\nAlterado com sucesso!\n");
		}
		else 
			System.out.println("\n**ERRO** Recepcionista solicitado, não encontrado!");
	}
}
