import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número a um atendimento bancário: ");
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("O saldo da sua conta é R$20.000.");
                break;
            case 2:
                System.out.println("O usuário cadastrado é Igor Vasconcelos.");
                break;
            case 3:
                System.out.println("Você será encaminhado a um atendente.");
                break;

            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
