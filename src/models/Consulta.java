package models;

public class Consulta {
	private Triagem triagem;
	private Consultorio consultorio;
	
	public Triagem getTriagems() {
		return triagem;
	}
	public void setTriagems(Triagem triagem) {
		this.triagem = triagem;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
	@Override
	public String toString() {
		return "Consulta para: " + triagem.getPaciente().getNome() + ", no consultorio: " + "Andar: " + consultorio.getAndar() + ("Sala: ")+ consultorio.getNome()  + "\n";
	}
	
}
