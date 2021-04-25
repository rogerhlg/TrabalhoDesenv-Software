package views;

import java.util.Scanner;

import controllers.Triagem;

public class AlterarDadosTriagem {
	public static void alterarPacTriagem() {
		Scanner s = new Scanner(System.in);
		Triagem triagem = new Triagem();
		System.out.println("---------- Alterar dados da Triagem do Paciente ----------");
		System.out.println("Informe o código da triagem que deseja alterar: ");
		triagem.idTriagem = Integer.parseInt(s.nextLine());
		System.out.println("Informe os sintomas");
		triagem.Sintomas = s.nextLine();
		triagem.setInt(1, triagem.Grau_urgencia);
		triagem.setString(2, triagem.Sintomas);
		triagem.setInt(3,   triagem.idTriagem);
		System.out.println("Dados da triagem alterados com sucesso");
	}
}
