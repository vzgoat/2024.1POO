import java.util.Scanner;

public class ProdutoCategoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("O produto é importante para a equipe? (sim/não): ");
        String importante = scanner.nextLine().trim().toLowerCase();;

        System.out.print("O equipamento é linha de frente? (sim/não): ");
        String linhaFrente = scanner.nextLine().trim().toLowerCase();;

        System.out.print("Existe um produto similar? (sim/não): ");
        String similar = scanner.nextLine().trim().toLowerCase();;

        String categoria = determinarCategoria(importante, linhaFrente, similar);

        System.out.println("O produto " + nomeProduto + " se enquadra na categoria: " + categoria);

        scanner.close();
    }
    public static String determinarCategoria(String importante, String linhaFrente, String similar) {
        if (importante.equals("sim")) {
            if (linhaFrente.equals("sim")) {
                if (similar.equals("sim")) {
                    return "y";
                } else {
                    return "z";
                }
            } else {
                return "x";
            }
        } else {
            return "Nenhuma categoria encontrada";
        }
    }
}
