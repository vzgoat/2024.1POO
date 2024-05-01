package project_faculdade;
import java.util.Scanner;
public class cursos {
	int opcao;
	int escolha;

	Scanner scam = new Scanner(System.in);	
	public void verificaCurso() {
		escolha = scam.nextInt();
		if (escolha == 1) {
			System.out.println("Curso Escolhido: Marketing");
		}else if (escolha == 2) {
			System.out.println("Curso Escolhido: Publicidade e Propaganda");
		}else if (escolha == 3) {
			System.out.println("Curso Escolhido: Comunicação");
		}else if (escolha == 4) {
			System.out.println("Curso Escolhido: Farmácia");
		}else if (escolha == 5) {
			System.out.println("Curso Escolhido: Ciências Contábeis");
		}else if (escolha == 6) {
			System.out.println("Curso Escolhido: Engenharia Civil");
		}else if (escolha == 7) {
			System.out.println("Curso Escolhido: Aeronáutica");
		}else if (escolha == 8) {
			System.out.println("Curso Escolhido: Ciência da computação");
		}
		else if (escolha == 9) {
			System.out.println("Curso Escolhido: Direito");
		}
		else if (escolha == 10) {
			System.out.println("Curso Escolhido: Medicina");
		}
		}
	}