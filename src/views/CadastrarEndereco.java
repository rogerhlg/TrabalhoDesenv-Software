package views;
import java.util.Scanner;

import models.Endereco;
public class CadastrarEndereco {
	
	private static Endereco endereco;
	private static Scanner sc = new Scanner(System.in);

	public static Endereco renderizar() {
		endereco = new Endereco();
		
		System.out.println("\n### ENDERE�O ###");
		System.out.println("\nLogradouro: ");
		endereco.setLogradouro(sc.next());
		System.out.println("\nN�mero: ");
		endereco.setNumero(sc.next());
		System.out.println("\nBairro: ");
		endereco.setBairro(sc.next());
		System.out.println("\nCidade: ");
		endereco.setCidade(sc.next());
		System.out.println("\nCEP: ");
		endereco.setCep(sc.next());
		
		return endereco;
	}
}