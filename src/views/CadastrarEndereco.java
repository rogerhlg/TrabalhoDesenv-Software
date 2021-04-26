package views;
import java.util.Scanner;

import models.Endereco;
public class CadastrarEndereco {
	
	private static Endereco endereco;
	private static Scanner sc = new Scanner(System.in);

	public static Endereco renderizar() {
		endereco = new Endereco();
		
		System.out.println("\nInsira o endereço:");
		System.out.println("\nLOGRADOURO: ");
		endereco.setLogradouro(sc.next());
		System.out.println("\nNÚMERO: ");
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