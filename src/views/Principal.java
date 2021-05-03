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
			System.out.println("4 - Consultar fila para a triagem");
			System.out.println("5 - Sair");
			System.out.println("\nDigite a opção desejada: ");
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
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						CadastrarRecepcionista.renderizar();
						break;
					case 2:
						ListarRecepcionistas.renderizar();
						break;
					case 3:
						AlterarRecepcionista.renderizar();
						break;
					case 4:
						DeletarRecepcionista.renderizar();
						break;
					case 0:
						System.out.println("Voltando...");
						break;
					default:
						System.out.println("Opção inválida!");
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
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						CadastrarPaciente.renderizar();
						break;
					case 2:
						ListarPacientes.renderizar();
						break;
					case 3:
						AlterarPaciente.renderizar();
						break;
					case 4:
						DeletarPaciente.renderizar();
						break;
					case 0:
						System.out.println("Voltando...");
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					} 
				} while (opcao != 0);
			}
			break;
			
			case 3:
				System.out.println("Triagem...");
				EfetuarTriagem.renderizar();
				break;
				
			case 4:
				do {
					System.out.println("\n-- FILA PARA A TRIAGEM --");
					System.out.println("\n1 - Proximo paciente");
					System.out.println("2 - Listar a fila completa");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						FilaTriagem.proximo();
						break;
					case 2:
						FilaTriagem.listar();
						break;
					case 0:
						System.out.println("Voltando...");
						break;
					default:
						System.out.println("Opção inválida!");
						break;
					} 
				} while (opcao != 0);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 5);
			

	}

}