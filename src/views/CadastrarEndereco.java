package views;
import java.util.Scanner;

import models.Endereco;
public class CadastrarEndereco {
	
	private static Endereco endereco;
	private static Scanner sc = new Scanner(System.in);

	public static Endereco renderizar() {
		endereco = new Endereco();
		
		System.out.println("\nInsira o LOGRADOURO: ");
		endereco.setLogradouro(sc.next());
		System.out.println("\nInsira o NUMERO: ");
		endereco.setNumero(sc.next());
		System.out.println("\nInsira o BAIRRO: ");
		endereco.setBairro(sc.next());
		System.out.println("\nInsira a CIDADE: ");
		endereco.setCidade(sc.next());
		System.out.println("\nInsira o CEP: ");
		endereco.setCep(sc.next());
		
		return endereco;
	}
}