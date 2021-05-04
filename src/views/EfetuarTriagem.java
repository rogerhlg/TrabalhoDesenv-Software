package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.FilaTriagemController;
import controllers.EnfermeiraController;
import controllers.SintomasController;
import controllers.TriagemController;
import models.Paciente;
import models.Enfermeira;
import models.Sintoma;
import models.Triagem;


public class EfetuarTriagem {
	private static Triagem triagem;
	private static Paciente paciente;
	private static Enfermeira enfermeira;
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Sintoma> sintomas;
	
	public static void renderizar() {
		int urgencia;
		System.out.println("\n---------- Efetuar Triagem ----------");
		triagem  = new Triagem();
		paciente = new Paciente();
		enfermeira = new Enfermeira();
		sintomas = new ArrayList<Sintoma>();
		
		System.out.println("\nInforme o CPF da enfermeira: ");
		enfermeira = EnfermeiraController.buscarPorCpf(sc.next());
		if( enfermeira != null) {
			triagem.setEnfermeira(enfermeira);
			paciente = FilaTriagemController.proximo();
			
			if( paciente != null) {
				String nome = paciente.getPessoa().getNome();
				String cpf = paciente.getPessoa().getCpf();
				
				System.out.println("\nTriagem aberta para: \nPaciente: " + nome + " | CPF: " + cpf );
				
				triagem.setPaciente(paciente);
				//CHAMANDO O CADASTRO DE SINTOMAS (NOME E GRAU DE GRAVIDADE)
				sintomas = CadastrarSintomas.renderizar();
				urgencia = SintomasController.retornoUrgencia(sintomas);
				triagem.setUrgencia(urgencia);
				triagem.setSintoma(sintomas);
				//ADICIONAR A TRIAGENS CONCLUIDAS
				TriagemController.cadastrar(triagem);
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
