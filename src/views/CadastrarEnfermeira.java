package views;

import controllers.EnfermeiraController;
import models.Enfermeira;

public class CadastrarEnfermeira {
	
	private static Enfermeira enfermeira;
	
	public static void renderizar() {
		enfermeira = new Enfermeira();
		System.out.println("\n-- CADASTRO DE ENFERMEIRA --");
		enfermeira.setPessoa(CadastrarPessoa.renderizar());
		if(EnfermeiraController.cadastrar(enfermeira)) {
			System.out.println("\nEnfermeira cadastrada com sucesso!");
		}
		else
			System.out.println("\n**ERRO** Já existe uma enfermeira com esse CPF!");

	}
}
