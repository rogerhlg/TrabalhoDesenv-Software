package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.FilaTriagemController;
import controllers.ISintomasController;
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
	private static ISintomasController sintomass = new SintomasController();
	private static EnfermeiraController controller = EnfermeiraController.retornarInstancia();
	private static FilaTriagemController controller1 = FilaTriagemController.retornarInstancia();
	
	public static void renderizar() {
		int urgencia;
		System.out.println("\n---------- Efetuar Triagem ----------");
		triagem  = new Triagem();
		paciente = new Paciente();
		enfermeira = new Enfermeira();
		sintomas = new ArrayList<Sintoma>();
		
		System.out.println("\nInforme o CPF da enfermeira: ");
		enfermeira = controller.buscarPorCpf(sc.next());
		if( enfermeira != null) {
			triagem.setEnfermeira(enfermeira);
			paciente = controller1.proximo();
			
			if( paciente != null) {
				String nome = paciente.getNome();
				String cpf = paciente.getCpf();

				
				System.out.println("\nTriagem aberta para: \nPaciente: " + nome + " | CPF: " + cpf );
				
				triagem.setPaciente(paciente);
				//CHAMANDO O CADASTRO DE SINTOMAS (NOME E GRAU DE GRAVIDADE)
				sintomas = CadastrarSintomas.renderizar();
				urgencia = sintomass.retornoUrgencia(sintomas);
				triagem.setUrgencia(urgencia);
				triagem.setSintoma(sintomas);
				//ADICIONAR A TRIAGENS CONCLUIDAS
				TriagemController.cadastrar(triagem);
				//REMOVENDO O PACIENTE DA FILA DA RECEPÇÃO, JÁ QUE CONCLUIU A TRIAGEM
				controller1.remover();
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
