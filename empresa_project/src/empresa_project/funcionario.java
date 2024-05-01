package empresa_project;
import java.util.Scanner;

public class funcionario {
 String nome_funcionario;
 String funcao_funcionario;
 int id_funcionario;

 Scanner scam = new Scanner(System.in);
 
 public void funcionarioAdd() {
     System.out.println("\n");

	 System.out.println("Solicitar dados do funcionário");
     System.out.println("Insira o nome do funcionário: ");
     nome_funcionario = scam.nextLine();     
     System.out.println("Insira a função do funcionário: ");
     funcao_funcionario = scam.nextLine();
     System.out.println("Insira o ID do funcionário: ");
     id_funcionario = scam.nextInt();
 }
}