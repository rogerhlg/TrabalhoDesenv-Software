package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Sintoma;
import utils.Console;

public class CadastrarSintomas {
	private static Scanner sc = new Scanner(System.in);
	private static Sintoma sintoma;
	private static ArrayList<Sintoma> sintomas;

	public static ArrayList<Sintoma> renderizar(){
		sintomas = new ArrayList<Sintoma>();
		int intensidade;
		int op;
		do { 
			sintoma = new Sintoma();
			System.out.println("\nInsira o sintoma: ");
			sintoma.setNome(sc.nextLine());
			do {
				intensidade = Console.lerInteiro("\nInforme o grau de intesidade - [1] FRACO - [2] M�DIO  - [3] FORTE");
				/*
				 * sc.nextLine();
				 */				if(intensidade>3 || intensidade <1) {
					System.out.println("\nGrau de intensidade inv�lido! Insira novamente");
				}
			}while(intensidade>3 || intensidade <1);
			sintoma.setGrauIntesidade(intensidade);
			sintomas.add(sintoma);
			do {
				op = Console.lerInteiro("\n1 - Inserir novo sintoma\n0 - Voltar");
				if (op != 1 && op != 0) {
					System.out.println("\n**ERRO** Op��o inv�lida!");
				}
			}while(op != 1 && op != 0);
		}while(op != 0);
		
		return sintomas;
	}
}
