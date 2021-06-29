package controllers;

import models.Paciente;
import java.util.LinkedList;
import java.util.Queue;

public class FilaTriagemController implements IFilaTriagemController {
	
	//Singleton
	private static FilaTriagemController controller;	
	public static  FilaTriagemController retornarInstancia() {
		if(controller  == null) {
			controller = new FilaTriagemController();
		}
		return controller;
	}
			
	private static Queue<Paciente> filaEspera = new LinkedList<Paciente>();
	
	@Override
	public boolean adicionar(Paciente paciente) {
		if(filaEspera.add(paciente)) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean remover() {
		if(filaEspera.poll()!= null) {
			return true;
		}
		return false;
	}
	
	@Override
	public Paciente proximo() {
		return filaEspera.peek();
	}
	
	@Override
	public void listar() {
		if(filaEspera.isEmpty()) {
			System.out.println("\nFila vazia!");
		}else {
			for(Paciente paciente : filaEspera) { 
				System.out.println(paciente.toString());
			}
		}
	}
	
}

