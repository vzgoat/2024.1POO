package aplicacao;
import java.util.Scanner;
import javax.swing.*;
public class Programa {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("\n Informe o produto que será cadastrado: ");
		produto.produto = scam.next();
		
		System.out.println("\n Informe a quantidade: ");
		produto.quantidade = scam.nextDouble();
		
		
		System.out.println("\n Informe o preço individual: ");
		produto.preco = scam.nextDouble();
	
		System.out.println("Confirmação: " + produto.produto + ", estoque atual: " +produto.quantidade);
		
		//Inserção de + produtos e atualização de estoque:
		
		System.out.println("Deseja inserir mais produtos? Quantidade: ");
		int estoque = scam.nextInt();
		
		produto.AddProduto(estoque);
		
		System.out.println("Atualização : " + produto.produto + "Estoque atual: " +produto.quantidade + " Preço: " +produto.preco); 
		
		//Subtraindo produtos ( Possiveis vendas ou percas )
		
		System.out.println(" Atualmente, alguma venda foi realizada? ");
		estoque = scam.nextInt(); 
		produto.Subtraiproduto(estoque);
		
		//Atualizando:
		
		System.out.println("Atualização pós vendas: "+produto.produto+ ", Estoque atual: "+produto.quantidade + " , Preço: " +produto.preco + ", Valor atual do estoque : " + produto.preco * produto.quantidade);
		
		JOptionPane.showConfirmDialog(null, "Atualização pós vendas: "+produto.produto+ ", Estoque atual: "+produto.quantidade + " , Preço: " +produto.preco + ", Valor atual do estoque : " + produto.preco * produto.quantidade);
		scam.close();
	}
	
}