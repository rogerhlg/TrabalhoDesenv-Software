package views;

import controllers.FilaTriagemController;
import controllers.PacienteController;
import models.Paciente;

public class CadastrarPaciente {

	private static Paciente paciente;	
	
	public static void renderizar() {
		paciente = new Paciente();
		System.out.println("\n-- CADASTRO DE PACIENTE --  \n");
		paciente.setPessoa(CadastrarPessoa.renderizar());
		if(PacienteController.cadastrar(paciente)) {
			System.out.println("\nPaciente cadastrado com sucesso!");
			if(FilaTriagemController.adicionar(paciente)){
				System.out.println("\nPaciente adicionado na lista de espera da triagem.");
			}
		}else {
			System.out.println("\n**ERRO** Esse paciente já existe!");
		}
	}
}