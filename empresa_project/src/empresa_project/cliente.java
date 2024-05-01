package empresa_project;
import java.util.Scanner;

public class cliente {
 String nome_cliente;
 String endereco_cliente;
 String email_cliente;

 Scanner scam = new Scanner(System.in);
 
 public void clienteAdd() {
	 System.out.println("Sessão de venda: ");
	 System.out.println("Informe os dados do cliente: ");
	 System.out.println("Insira o nome do cliente: ");
	 nome_cliente = scam.nextLine();
	 System.out.println("Insira endereco do cliente: ");
	 endereco_cliente = scam.nextLine();
	 System.out.println("Insira o email do cliente: ");
	 email_cliente = scam.nextLine();
 
 }
}