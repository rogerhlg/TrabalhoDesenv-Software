package views;

import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		
		do {
			System.out.println("\n-- PROJETO TRIAGEM --");
			System.out.println("\n1 - Recepcionista");
			System.out.println("2 - Paciente");
			System.out.println("3 - Triagem");
			System.out.println("4 - Sair");
			System.out.println("\nDigite a op��o desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				do {
					System.out.println("\n-- MENU RECEPCIONISTA --");
					System.out.println("\n1 - Cadastrar recepcionista");
					System.out.println("2 - Listar recepcionistas");
					System.out.println("3 - Alterar recepcionista");
					System.out.println("4 - Deletar recepcionista");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a op��o desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						System.out.println("Cadastrando...");
						break;
					case 2:
						System.out.println("Listando...");
						break;
					case 3:
						System.out.println("Alterando...");
						break;
					case 4:
						System.out.println("Deletando...");
						break;
					case 0:
						System.out.println("Voltando...");
						break;
					default:
						System.out.println("Op��o inv�lida!");
						break;
					} 
				} while (opcao != 0);
			}
			break;
				
			case 2: {
				do {
					System.out.println("\n-- MENU PACIENTE --");
					System.out.println("\n1 - Cadastrar paciente");
					System.out.println("2 - Listar paciente");
					System.out.println("3 - Alterar paciente");
					System.out.println("4 - Deletar paciente");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a op��o desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						System.out.println("Cadastrando...");
						break;
					case 2:
						System.out.println("Listando...");
						break;
					case 3:
						System.out.println("Alterando...");
						break;
					case 4:
						System.out.println("Deletando...");
						break;
					case 0:
						System.out.println("Voltando...");
						break;
					default:
						System.out.println("Op��o inv�lida!");
						break;
					} 
				} while (opcao != 0);
			}
			break;
			
			case 3:
				System.out.println("Triagem...");
				break;
				
			case 4:
				System.out.println("Saindo...");
				break;
			
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		} while (opcao != 4);
			

	}

}