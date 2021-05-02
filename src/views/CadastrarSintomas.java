package views;

import java.util.ArrayList;
import java.util.Scanner;

import models.Sintoma;

public class CadastrarSintomas {
	private static Scanner sc = new Scanner(System.in);
	private static Sintoma sintoma;
	private static ArrayList<Sintoma> sintomas = new ArrayList<Sintoma>();;

	public static ArrayList<Sintoma> renderizar(){
		int intensidade;
		do { 
			sintoma = new Sintoma();
			System.out.println("\nInsira o sintoma: ");
			sintoma.setNome(sc.next());
			do {
				System.out.println("\nInforme o Grau de intesidade - [1] FRACO - [2] MÉDIO  - [3] FORTE");
				intensidade = sc.nextInt();
				if(intensidade>3 || intensidade <1) {
					System.out.println("\nGrau de intensidade inválido! Insira novamente");
				}
			}while(intensidade>3 || intensidade <1);
			sintoma.setGrauIntesidade(intensidade);

			sintomas.add(sintoma);
			System.out.println("\n1-Inserir novo sintoma\n2-Sair");
		}while(sc.nextInt() != 2);
		
		return sintomas;
	}
}
