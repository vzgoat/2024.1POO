package project_faculdade;

public class aplicacao {
	
	public static void main(String[] args) {
	
		faculdade faculdade = new faculdade();
		notaAluno notaAluno = new notaAluno();
		professores professores = new professores();
		alunos alunos = new alunos();
		
		faculdade.faculdadeAdd();
		notaAluno.notaAdd();
		alunos.alunosAdd();
		professores.professoresAdd();
	}
}