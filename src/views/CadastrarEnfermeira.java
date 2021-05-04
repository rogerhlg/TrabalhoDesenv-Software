//package views;
//
//import controllers.RecepcionistaController;
//import models.Enfermeira;
//
//public class CadastrarEnfermeira {
//	
//	private static Enfermeira enfermeira;
//	
//	public static void renderizar() {
//		enfermeira = new Enfermeira();
//		System.out.println("\n-- CADASTRO DE ENFERMEIRA --");
//		enfermeira.setPessoa(CadastrarPessoa.renderizar());
//		if(RecepcionistaController.cadastrar(enfermeira)) {
//			System.out.println("\nRecepcionista cadastrado com sucesso!");
//		}
//		else
//			System.out.println("\n**ERRO** Esse recepcionista já existe");
//
//	}
//}
