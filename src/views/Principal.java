package views;

import java.util.Scanner;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		
		do {
			System.out.println("\n-- TRIAGEM HOSPITALAR --");
			System.out.println("\n1 - Recepcionista");
			System.out.println("2 - Paciente");
			System.out.println("3 - Triagem");
			System.out.println("4 - Consulta com médico");
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
				do {
					System.out.println("\n-- MENU TRIAGEM --");
					System.out.println("\n1 - Nova triagem");
					System.out.println("2 - Próximo paciente");
					System.out.println("3 - Consultar fila de espera para triagem (por ordem de chegada)");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						EfetuarTriagem.renderizar();
						break;
					case 2:
						FilaTriagem.proximo();
						break;
					case 3:
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
			case 4:
				do {
					System.out.println("\n-- MENU CONSULTA COM MÉDICO --");
					System.out.println("\n1 - Nova consulta");
					System.out.println("2 - Próximo paciente");
					System.out.println("3 - Fila de espera para consulta (por ordem de prioridade)");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						System.out.println("consulta...");
						break;
					case 2:
						System.out.println("próximo paciente");
						break;
					case 3:
						System.out.println("fila de espera...");
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