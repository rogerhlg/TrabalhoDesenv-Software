package views;

import java.util.Scanner;

import controllers.TriagemController;

public class Principal {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int opcao;
		
		do {
			System.out.println("\n-- TRIAGEM HOSPITALAR --");
			System.out.println("\n1 - Enfermeira");
			System.out.println("2 - Paciente");
			System.out.println("3 - Triagem");
			System.out.println("4 - Consulta");
			System.out.println("5 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				do {
					System.out.println("\n-- MENU ENFERMEIRA --");
					System.out.println("\n1 - Cadastrar enfermeira");
					System.out.println("2 - Listar enfermeiras");
					System.out.println("3 - Alterar enfermeira");
					System.out.println("4 - Deletar enfermeira");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						CadastrarEnfermeira.renderizar();
						break;
					case 2:
						ListarEnfermeiras.renderizar();
						break;
					case 3:
						AlterarEnfermeira.renderizar();
						break;
					case 4:
						DeletarEnfermeira.renderizar();
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
					System.out.println("4 - Listar triagens realizadas");
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
					case 4:
						ListarTriagensRealizadas.listarTriagens();
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
					System.out.println("1 - Fila de espera para consulta (por ordem de prioridade)");
					System.out.println("0 - Voltar");
					System.out.println("\nDigite a opção desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						TriagemController.listar();
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