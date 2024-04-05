import java.util.Scanner;

//questao 3

public class CalculoMediaAlunosFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop para calcular a média de 5 notas para 2 alunos
        for (int aluno = 1; aluno <= 2; aluno++) {
            System.out.println("Aluno " + aluno + ":");
            double somaNotas = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double media = somaNotas / 5;
            System.out.println("Média do Aluno " + aluno + ": " + media);

            if (media >= 7.0) {
                System.out.println("Status: Aprovado");
            } else if (media >= 4.0) {
                System.out.println("Status: Reprovado com direito a recuperação");
            } else {
                System.out.println("Status: Reprovado sem direito a recuperação");
            }
            System.out.println();
        }

        scanner.close();
    }
}
