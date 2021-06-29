package controllers;

import java.util.ArrayList;

import models.Sintoma;

public class SintomasController {
	
	public int retornoUrgencia(ArrayList<Sintoma> sintomas) {
		int urgencia = 0;
		
		for(Sintoma SintomaCadastrado : sintomas) {
			urgencia += SintomaCadastrado.getGrauIntesidade();
			}
		
		return urgencia;
	}
	
}
