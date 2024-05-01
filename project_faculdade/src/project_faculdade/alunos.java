package project_faculdade;
import java.util.Scanner;

public class alunos {
	String nome;
	String endereco;
	int id_aluno;
	
	Scanner scam = new Scanner(System.in);
	
	public void alunosAdd() {
		System.out.println("Dados do aluno: ");
		System.out.println("Nome: ");
		nome = scam.nextLine();
		System.out.println("Endereco: ");
		endereco = scam.nextLine();
		System.out.println("Id do aluno: ");
		id_aluno = scam.nextInt();
	}
}