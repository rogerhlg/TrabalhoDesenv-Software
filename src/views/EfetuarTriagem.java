package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.FilaTriagemController;
import controllers.RecepcionistaController;
import models.Paciente;
import models.Recepcionista;
import models.Sintoma;
import models.Triagem;


public class EfetuarTriagem {
	private static Triagem triagem;
	private static Paciente paciente;
	private static Recepcionista recepcionista;
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Sintoma> sintomas;
	
	public static void renderizar() {
		
		System.out.println("\n---------- Efetuar Triagem ----------");
		triagem  = new Triagem();
		paciente = new Paciente();
		recepcionista = new Recepcionista();
		sintomas = new ArrayList<Sintoma>();
		
		System.out.println("\nInforme o CPF do recepcionista: ");
		recepcionista = RecepcionistaController.buscarPorCpf(sc.next());
		if( recepcionista != null) {
			triagem.setRecepcionista(recepcionista);
			paciente = FilaTriagemController.proximo();
			
			if( paciente != null) {
				String nome = paciente.getPessoa().getNome();
				String cpf = paciente.getPessoa().getCpf();
				
				System.out.println("\nTriagem aberta para: \nPaciente: " + nome + " | CPF: " + cpf );
				
				triagem.setPaciente(paciente);
				//CHAMANDO O CADASTRO DE SINTOMAS (NOME E GRAU DE GRAVIDADE)
				sintomas = CadastrarSintomas.renderizar();
				triagem.setSintoma(sintomas);
				
				//REMOVENDO O PACIENTE DA FILA DA RECEPÇÃO, JÁ QUE CONCLUIU A TRIAGEM
				FilaTriagemController.remover();
				System.out.println("\nTriagem Finalizada!");
			}
			else {
				System.out.println("Fila de pacientes vazia!");
			}
		}
		else {
			System.out.println("\n**ERRO** Recepcionista inexistente!");
		}	
	}
}
