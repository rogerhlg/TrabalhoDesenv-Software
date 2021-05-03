package controllers;

import models.Paciente;
import java.util.LinkedList;
import java.util.Queue;

public class FilaTriagemController {
	private static Queue<Paciente> filaEspera = new LinkedList<Paciente>();
	
	public static boolean adicionar(Paciente paciente) {
		if(filaEspera.add(paciente)) {
			return true;
		}
		return false;
	}
	
	public static boolean remover() {
		if(filaEspera.poll()!= null) {
			return true;
		}
		return false;
	}
	
	public static Paciente proximo() {
		return filaEspera.peek();
	}
	
	public static void listar() {
		for(Paciente paciente : filaEspera) { 
			System.out.println(paciente.toString()); 
		}
	}
	
}

