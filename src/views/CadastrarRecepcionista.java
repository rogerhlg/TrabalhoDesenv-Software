package views;

import java.util.Scanner;

import controllers.RecepcionistaController;
import models.Recepcionista;

public class CadastrarRecepcionista {
	
	private static Recepcionista recepcionista;
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		recepcionista = new Recepcionista();
		System.out.println("\n******* CADASTRO DE RECEPCIONISTA*******");
		recepcionista.setPessoa(CadastrarPessoa.renderizar());
		if(RecepcionistaController.cadastrar(recepcionista)) {
			System.out.println("\nRecepcionista cadastrado com sucesso!");
		}
		else
			System.out.println("\n **ERRO** Recepcionista já existe.");

	}
}
