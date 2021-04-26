package views;

import models.Pessoa;

import java.util.Scanner;
public class CadastrarPessoa {
	
	private static Pessoa pessoa;
	private static Scanner sc = new Scanner(System.in);
	
	public static Pessoa renderizar() {
		pessoa = new Pessoa();
		System.out.println("\nInsira o nome: ");
		pessoa.setNome(sc.next());
		
		System.out.println("\nInsira o sobrenome: ");
		pessoa.setSobrenome(sc.next());
		
		System.out.println("\nInsira o cpf: ");
		pessoa.setCpf(sc.next());
		
		System.out.println("\nInsira a idade: ");
		pessoa.setIdade(sc.nextInt());
		
		System.out.println("\nInsira o telefone: ");
		pessoa.setTelefone(sc.next());
		
		System.out.println("\nInsira o email: ");
		pessoa.setEmail(sc.next());
		
		pessoa.setEndereco(CadastrarEndereco.renderizar());
		
		return pessoa;
	}
	
	
}
