package views;

import java.util.Scanner;

import controllers.Triagem;

public class EfetuarTriagem {
	
	
	public static void efetuarTriagem() {
		String d;
		System.out.println("---------- Efetuar Triagem ----------");
		
		Triagem triagem = new Triagem();
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Código da Triagem: ");
		triagem.idTriagem = Integer.parseInt(s.nextLine());
		System.out.println("Informe o Código do paciente: ");
		triagem.idPaciente = Integer.parseInt(s.nextLine());
		System.out.println("Informe o Grau de urgencia([1] - [2] - [3]");
		triagem.Grau_urgencia = Integer.parseInt(s.nextLine());
		System.out.println("Infome os Sintomas do paciente");
		triagem.Sintomas = s.nextLine();
		
		System.out.println("Triagem Efetuada!");
		}
	
	

}
