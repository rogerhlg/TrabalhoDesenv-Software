package controllers;

import models.Consulta;
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
	private static Consultorio consultorio = new Consultorio();
	private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();
	private static Consulta consulta = new Consulta();
	private static Queue<Triagem> queue = new LinkedList();
	private static ArrayList<String> medico = new ArrayList<>();

	public static ArrayList<Consultorio> formarConsultorios() {
		for(int i=0; i<5; i++) {
			consultorio = new Consultorio();
			consultorio.setDisponibilidade(true);
			consultorio.setAndar(String.valueOf(1));
			consultorio.setNome(String.valueOf(i));
			consultorio.setPaciente(null);
			consultorios.add(consultorio);
		}
		return consultorios;
	}
	
	public static ArrayList<Triagem> listarTriagens() {
		return filaConsulta;
	}
	
	public static Consulta cadastrar(Triagem triagem){
		if(consultorios.isEmpty()) {
			formarConsultorios();
		}
		
		filaConsulta.add(triagem);
		Collections.sort(filaConsulta);
		
		for (Consultorio consultorio : consultorios) {
			if(consultorio.getDisponibilidade()) {
				consultorio.setDisponibilidade(false);
				consultorio.setPaciente((triagem.getPaciente()));
				consulta.setConsultorio(consultorio);
				consulta.setTriagems(triagem);
				consultas.add(consulta);
				return consulta;
			}
		}
		return null;
		
	}
	
	public static ArrayList<Triagem> listar() {
		
		if(!filaConsulta.isEmpty()) {
			Queue<Triagem> queue = new LinkedList(filaConsulta);
			return filaConsulta; //mudar isso, printar na view 
		}
		else
			return null;
	}
	

	public static Triagem proxPaciente() {
		if(!filaConsulta.isEmpty()) {
			return filaConsulta.get(0);	
		}
		return null;
	}
	
	public static void realizarConsulta() {
		int intensidadeSintomaCovid = 0;
		Queue<Triagem> queue = new LinkedList(filaConsulta); 
		Triagem consulta = queue.poll();
		filaConsulta.remove(consulta);
		
		String pacienteDavez = consulta.getPaciente().getCpf();
		
		for(Consultorio consultorioOcupacao : consultorios) {
			if(consultorioOcupacao!= null) {
				if(consultorioOcupacao.getPaciente() != null) {
					String cpf = consultorioOcupacao.getPaciente().getCpf();
					if(cpf.equals(pacienteDavez)) {
						System.out.println("\nConsulta aberta para: " + consultorioOcupacao.getPaciente().getNome() + " " + consultorioOcupacao.getPaciente().getSobrenome() + " - Na sala: " + consultorioOcupacao.getNome() + "\n");
					}
				}		
			}	
		}
		sintomas = consulta.getSintoma();
		for (Sintoma sintomaPaciente : sintomas) {
			String sintoma = sintomaPaciente.getNome();	
			if(sintoma.equals("febre") || sintoma.equals("falta de ar") || sintoma.equals("dor no peito") || sintoma.equals("tosse") || sintoma.equals("cansaço")) {
				System.out.println("\nSintoma detectado: " + sintomaPaciente.getNome());	
				intensidadeSintomaCovid += sintomaPaciente.getGrauIntesidade();
			}
		}
		if(intensidadeSintomaCovid>5) {
			System.out.println("\n*****ALTO RISCO DE COVID******, vamos iniciar o isolamento.");	
		}
		else
			System.out.println("\nEsta tudo bem, um xarope resolve.\n");	
		
	}
}
