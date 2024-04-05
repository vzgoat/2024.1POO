//questao 2

public class NumerosImparesWhile {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 70 (usando while):");
        int contador = 1;
        while (contador <= 70) {
            if (contador % 2 != 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}
