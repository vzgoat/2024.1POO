//Questao 1 FOR

import java.util.Scanner;

public class MainJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaFor = 0;
        System.out.println("Digite 8 números para calcular a soma e a média (usando for):");
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            somaFor += numero;
        }
        double mediaFor = (double) somaFor / 8;

        System.out.println("Soma dos números (usando for): " + somaFor);
        System.out.println("Média dos números (usando for): " + mediaFor);

        scanner.close();
    }
}

