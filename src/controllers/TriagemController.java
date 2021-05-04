package controllers;

import models.Triagem;
import java.util.ArrayList;

public class TriagemController {
	
	private static ArrayList<Triagem> triagens = new ArrayList<Triagem>(); 

	public static ArrayList<Triagem> listarTriagens() {
		return triagens;
	}
}
