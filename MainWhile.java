//questao 1 while

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaWhile = 0;
        int contador = 0;
        System.out.println("\nDigite 8 números para calcular a soma e a média :");
        while (contador < 8) {
            System.out.println("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            somaWhile += numero;
            contador++;
        }
        double mediaWhile = (double) somaWhile / 8;

        System.out.println("Soma dos números (usando while): " + somaWhile);
        System.out.println("Média dos números (usando while): " + mediaWhile);

        scanner.close();
    }
}
