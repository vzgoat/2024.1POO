package project_faculdade;
import java.util.Scanner;
public class notaAluno {

	int nota;
	int escolha;
	Scanner scam = new Scanner(System.in);
	cursos cursos = new cursos();
	
	public void notaAdd() {
		System.out.println("\n");
		System.out.println("Insira sua nota SISU: ");
		nota = scam.nextInt();
		
		if (nota >= 550 && nota <= 679) {
		System.out.println("Cursos disponiveis para essa nota: ");
		System.out.println("1 - Marketing");
		System.out.println("2 - Publicidade e Propaganda");
		System.out.println("3 - Comunicação");
		System.out.println("Escolha a opção: ");
		cursos.verificaCurso();
	
		} else if (nota >= 680 && nota <= 729){
		System.out.println("Cursos disponiveis para essa nota: ");
		System.out.println("4 - Farmácia");
		System.out.println("5-  Ciências Contábeis");
		System.out.println("6 - Engenharia Civil");
		System.out.println("Escolha a opção: ");
		cursos.verificaCurso();
		} else if (nota >= 730) {
			System.out.println("Cursos disponiveis para essa nota: ");
			System.out.println("7 - Aeronáutica");
			System.out.println("8 - Ciência Da computação");
			System.out.println("9 - Direito");
			System.out.println("10 - Medicina");
			System.out.println("Escolha a opção: ");
			cursos.verificaCurso();
			
		}else {
			System.out.println("Nenhum curso disponível para ess nota.");
		}
	}
}