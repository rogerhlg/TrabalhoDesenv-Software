package views;

import java.util.Scanner;
import controllers.EnfermeiraController;
import models.Enfermeira;

public class CadastrarEnfermeira {
	
	private static Enfermeira enfermeira;
	private static Scanner sc = new Scanner(System.in);
	
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
		
		System.out.println("\nInsira a idade: ");
		enfermeira.setIdade(sc.nextInt());
		
		System.out.println("\nInsira o telefone: ");
		enfermeira.setTelefone(sc.next());
		
		System.out.println("\nInsira o email: ");
		enfermeira.setEmail(sc.next());
		
		enfermeira.setEndereco(CadastrarEndereco.renderizar());
		//enfermeira.setPessoa(CadastrarPessoa.renderizar());
		if(EnfermeiraController.cadastrar(enfermeira)) {
			System.out.println("\nEnfermeira cadastrada com sucesso!");
		}
		else
			System.out.println("\n**ERRO** J� existe uma enfermeira com esse CPF!");

	}
}
