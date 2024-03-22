import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_notas = 4;
        double total_notas = 0;

        for (int contador = 1; contador <= num_notas; contador++) {
            System.out.println("Insira a nota " + contador + ":");
            double notas = scanner.nextDouble();
            total_notas += notas;
        }
        double media = total_notas / num_notas;
        System.out.println("A média das notas é: " + media);
        if (media >= 7) {
            System.out.println("Aprovado.");
        } else if (media < 7 || media >= 4) {
            System.out.println("Reprovado com direito a recuperação.");
        } else if (media < 4) {
            System.out.println("Reprovado.");
        }
        
        scanner.close();
    }
}
