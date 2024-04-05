import java.util.Scanner;

//questao 3
public class CalculoMediaAlunosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aluno = 1;
        while (aluno <= 2) {
            System.out.println("Aluno " + aluno + ":");
            double somaNotas = 0;
            int i = 1;
            while (i <= 5) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
                i++;
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

            aluno++;
        }

        scanner.close();
    }
}
