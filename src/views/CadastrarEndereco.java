package views;
import java.util.Scanner;

import models.Endereco;
public class CadastrarEndereco {
	
	private static Endereco endereco;
	private static Scanner sc = new Scanner(System.in);

	public static Endereco renderizar() {
		endereco = new Endereco();
		
		System.out.println("\nInsira o endere�o:");
		System.out.println("\nLOGRADOURO: ");
		endereco.setLogradouro(sc.next());
		System.out.println("\nN�MERO: ");
		endereco.setNumero(sc.next());
		System.out.println("\nBAIRRO: ");
		endereco.setBairro(sc.next());
		System.out.println("\nCIDADE: ");
		endereco.setCidade(sc.next());
		System.out.println("\nCEP: ");
		endereco.setCep(sc.next());
		
		return endereco;
	}
}