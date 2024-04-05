//questao 2

public class NumerosImparFor {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 70 (usando for):");
        for (int i = 1; i <= 70; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
