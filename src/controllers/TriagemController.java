package controllers;

import models.Triagem;
import java.util.ArrayList;
import java.util.Collections;

public class TriagemController {
	
	private static ArrayList<Triagem> triagens = new ArrayList<Triagem>(); 

	public static ArrayList<Triagem> listarTriagens() {
		return triagens;
	}
	
	public static void cadastrar(Triagem triagem){
		triagens.add(triagem);
	}
	public static void listar() {
		Collections.sort(triagens);
		System.out.println(triagens);
		
	}
}
