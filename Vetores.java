import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] numeros = new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextInt();
        }
        float somaImpares = 0;
        for (float numero : numeros) {
            somaImpares += (numero % 2 != 0) ? numero : 0;
        }
        float somaPares = 0;
        for (float numero : numeros) {
            somaPares += (numero % 2 == 0) ? numero : 0;
        }
        float diferenca = somaImpares - somaPares;
        float divisorProximo = ((diferenca + 10 / 2) / 10 * 10);
        float resultadoFinal = diferenca - divisorProximo;

        System.out.println("A soma dos números ímpares é: " + somaImpares);
        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A diferença entre as somas é: " + diferenca);
        System.out.println("O divisor de 10 mais próximo é: " + divisorProximo);
        System.out.println("O resultado final é: " + resultadoFinal);

        scanner.close();
    }
}
