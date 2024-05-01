package empresa_project;
//import javax.swing.JOptionPane;
public class aplicacao {

	public static void main(String[] args) {
		 empresa empresa = new empresa();
		 fornecedor fornecedor = new fornecedor();
		 produto produto = new produto();
		 funcionario funcionario = new funcionario();
		 cliente cliente = new cliente();
		 		 
		 empresa.empresaAdd();
		 fornecedor.fornecedorAdd();
		 produto.produtoAdd();
	     funcionario.funcionarioAdd();
	     cliente.clienteAdd();
	     //JOptionPane.showConfirmDialog(empresa.empresaAdd(), fornecedor.fornecedorAdd(), produto.produtoAdd(), funcionario.funcionarioAdd(), cliente.clienteAdd());
	}
}