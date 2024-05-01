package project_faculdade;
import java.util.Scanner;

public class professores {

	String nome;
	String endereco;
	String disciplina;
	int id_professor;
	
	Scanner scam = new Scanner(System.in);
	
	public void professoresAdd() {
		
		System.out.println("Dados do professor: ");
		System.out.println("Nome: ");
		nome = scam.nextLine();
		System.out.println("Endereco: ");
		endereco = scam.nextLine();
		System.out.println("Disciplina: ");
		disciplina = scam.nextLine();
		System.out.println("Id do professor: ");
		id_professor = scam.nextInt();
	}
}