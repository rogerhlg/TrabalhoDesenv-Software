package views;

import java.util.Scanner;

import controllers.FilaTriagemController;
import controllers.PacienteController;
import models.Paciente;
import utils.Console;

public class CadastrarPaciente {

	private static Paciente paciente;
	private static Scanner sc = new Scanner(System.in);
	private static FilaTriagemController controller = FilaTriagemController.retornarInstancia();
	private static PacienteController controller2 = PacienteController.retornarInstancia();
	
	public static void renderizar() {
		paciente = new Paciente();
		System.out.println("\n-- CADASTRO DE PACIENTE --  \n");
		System.out.println("\n### DADOS PESSOAIS ### ");
		System.out.println("\nInsira o nome: ");
		paciente.setNome(sc.next());
		
		System.out.println("\nInsira o sobrenome: ");
		paciente.setSobrenome(sc.next());
		
		System.out.println("\nInsira o CPF: ");
		paciente.setCpf(sc.next());
		
		paciente.setIdade(Console.lerInteiro("\nInsira a idade: "));
		
		System.out.println("\nInsira o telefone: ");
		paciente.setTelefone(sc.next());
		
		System.out.println("\nInsira o email: ");
		paciente.setEmail(sc.next());
		
		paciente.setEndereco(CadastrarEndereco.renderizar());
		//paciente.setPessoa(CadastrarPessoa.renderizar());
		if(controller2.cadastrar(paciente)) {
			System.out.println("\nPaciente cadastrado com sucesso!");
			if(controller.adicionar(paciente)){
				System.out.println("\nPaciente adicionado na lista de espera da triagem.");
			}
		}else {
			System.out.println("\n**ERRO** Já existe um paciente com esse CPF!");
		}
	}
}