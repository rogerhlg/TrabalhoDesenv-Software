package controllers;

import models.Consultorio;
import models.Sintoma;
import models.Triagem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TriagemController {
	
	private static ArrayList<Triagem> filaConsulta = new ArrayList<Triagem>(); 
	private static ArrayList<Sintoma> sintomas = new ArrayList<Sintoma>(); 
	private static ArrayList<Consultorio> consultorios = new ArrayList<Consultorio>();
	private static Queue<Triagem> queue = new LinkedList();
	private static ArrayList<String> medico = new ArrayList<>();

	public static ArrayList<Triagem> listarTriagens() {
		return filaConsulta;
	}
	
	public static void cadastrar(Triagem triagem){
		filaConsulta.add(triagem);
		Collections.sort(filaConsulta);
	}
	
	public static void listar() {
		
		if(!filaConsulta.isEmpty()) {
			System.out.println(filaConsulta); //mudar isso, printar na view 
		}
		else
			System.out.println("Fila vazia!");
	}
	

	public static void proxPaciente() {
		if(!filaConsulta.isEmpty()) {
			System.out.println(filaConsulta.get(0)+ "\n\n\n\n");	
		}
	}
	
	public static void resultadoConsulta() {
		int intensidadeSintomaCovid = 0;
		Queue<Triagem> queue = new LinkedList(filaConsulta);
		Triagem consulta = queue.poll();
		System.out.println(consulta);	

		sintomas = consulta.getSintoma();
		for (Sintoma sintomaPaciente : sintomas) {
			String sintoma = sintomaPaciente.getNome();	
			if(sintoma.equals("febre") || sintoma.equals("falta de ar")) {
				System.out.println("\nUm sintoma detectado: " + sintomaPaciente.getNome());	
				intensidadeSintomaCovid += sintomaPaciente.getGrauIntesidade();
			}
		}
		if(intensidadeSintomaCovid>5) {
			System.out.println("\n*****Covid******, vamos iniciar o isolamento.");	
		}
		else
			System.out.println("\nEsta tudo bem, um xarope resolve.\n");	
		
	}
}
