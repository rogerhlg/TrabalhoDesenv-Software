package views;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.PacienteController;
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
			
			System.out.println("\nInforme o CPF do paciente: ");
			paciente = PacienteController.buscarPorCpf(sc.next());
			if( paciente != null) {
				triagem.setPaciente(paciente);
				//CHAMANDO O CADASTRO DE SINTOMAS (NOME E GRAU DE GRAVIDADE)
				sintomas = CadastrarSintomas.renderizar();

			}
			else {
				System.out.println("**ERRO, paciente inexistente!**");
			}
		}
		else {
			System.out.println("\nERRO, recepcionista inexistente!");
		}
		
		System.out.println("\nTriagem Efetuada!");
		}
	
	

}
