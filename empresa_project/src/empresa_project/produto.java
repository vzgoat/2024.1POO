package empresa_project;
import java.util.Scanner;

public class produto {
 String nome_produto;
 double preco_produto;
 int quantidade_estoque;

 Scanner scam = new Scanner(System.in);
 
 public void produtoAdd() {
     System.out.println("\n");
	 System.out.println("Sessão de vendas");
	 System.out.println("Produto: ");
	 nome_produto = scam.nextLine();
	 System.out.println("Preço: ");
	 preco_produto = scam.nextDouble();
	 System.out.println("Quantidade estoque: ");
	 quantidade_estoque = scam.nextInt();
 	}
 }