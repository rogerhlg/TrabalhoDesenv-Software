package views;

import java.util.Scanner;
import controllers.EnfermeiraController;
import models.Enfermeira;
import utils.Console;

public class CadastrarEnfermeira {
	
	private static Enfermeira enfermeira;
	private static Scanner sc = new Scanner(System.in);
	private static EnfermeiraController controller = EnfermeiraController.retornarInstancia();

	
	public static void renderizar() {
		enfermeira = new Enfermeira();
		System.out.println("\n-- CADASTRO DE ENFERMEIRA --");
		System.out.println("\n### DADOS PESSOAIS ### ");
		System.out.println("\nInsira o nome: ");
		enfermeira.setNome(sc.next());
		
		System.out.println("\nInsira o sobrenome: ");
		enfermeira.setSobrenome(sc.next());
		
		System.out.println("\nInsira o CPF: ");
		enfermeira.setCpf(sc.next());
		
		enfermeira.setIdade(Console.lerInteiro("\nInsira a idade: "));
		
		System.out.println("\nInsira o telefone: ");
		enfermeira.setTelefone(sc.next());
		
		System.out.println("\nInsira o email: ");
		enfermeira.setEmail(sc.next());
		
		enfermeira.setEndereco(CadastrarEndereco.renderizar());
		//enfermeira.setPessoa(CadastrarPessoa.renderizar());
		if(controller.cadastrar(enfermeira)) {
			System.out.println("\nEnfermeira cadastrada com sucesso!");
		}
		else
			System.out.println("\n**ERRO** Já existe uma enfermeira com esse CPF!");

	}
}
