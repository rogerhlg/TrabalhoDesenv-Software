package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Sintoma;

public class CadastrarSintomas {
	private static Scanner sc = new Scanner(System.in);
	private static Sintoma sintoma;
	private static ArrayList<Sintoma> sintomas;;

	public static ArrayList<Sintoma> renderizar(){
		sintomas = new ArrayList<Sintoma>();
		int intensidade;
		int op;
		do { 
			sintoma = new Sintoma();
			System.out.println("\nInsira o sintoma: ");
			sintoma.setNome(sc.next());
			do {
				System.out.println("\nInforme o grau de intesidade - [1] FRACO - [2] MÉDIO  - [3] FORTE");
				intensidade = sc.nextInt();
				if(intensidade>3 || intensidade <1) {
					System.out.println("\nGrau de intensidade inválido! Insira novamente");
				}
			}while(intensidade>3 || intensidade <1);
			sintoma.setGrauIntesidade(intensidade);

			sintomas.add(sintoma);
			do {
				System.out.println("\n1 - Inserir novo sintoma\n0 - Voltar");
				op = sc.nextInt();
				if (op != 1 && op != 0) {
					System.out.println("\n**ERRO** Opção inválida!");
				}
			}while(op != 1 && op != 0);
		}while(op != 0);
		
		return sintomas;
	}
}
