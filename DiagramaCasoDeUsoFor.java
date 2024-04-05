import java.util.Scanner;

public class DiagramaCasoDeUsoFor {
    public static void main(String[] args) {
        // Criando atores
        Ator usuario = new Ator("Usuário");
        Ator sistema = new Ator("Sistema");

        // Criando casos de uso
        List<String> acoesBuscarProduto = Arrays.asList("Buscar produto", "Exibir resultados");
        CasoDeUso buscarProduto = new CasoDeUso("Buscar Produto", acoesBuscarProduto);

        List<String> acoesAdicionarCarrinho = Arrays.asList("Visualizar detalhes", "Adicionar ao carrinho");
        CasoDeUso adicionarCarrinho = new CasoDeUso("Adicionar ao Carrinho", acoesAdicionarCarrinho);

        List<String> acoesFinalizarCompra = Arrays.asList("Visualizar carrinho", "Selecionar forma de pagamento", "Finalizar compra");
        CasoDeUso finalizarCompra = new CasoDeUso("Finalizar Compra", acoesFinalizarCompra);

        List<String> acoesVisualizarPedido = Arrays.asList("Acessar histórico de pedidos", "Visualizar detalhes do pedido");
        CasoDeUso visualizarPedido = new CasoDeUso("Visualizar Pedido", acoesVisualizarPedido);

        List<String> acoesGerenciarEstoque = Arrays.asList("Adicionar produto", "Remover produto", "Atualizar quantidade");
        CasoDeUso gerenciarEstoque = new CasoDeUso("Gerenciar Estoque", acoesGerenciarEstoque);

        // Associando casos de uso
        // Include: Adicionar ao Carrinho inclui Buscar Produto
        buscarProduto.acoes.addAll(acoesAdicionarCarrinho);

        // Include: Finalizar Compra inclui Adicionar ao Carrinho
        adicionarCarrinho.acoes.addAll(acoesFinalizarCompra);

        // Extend: Gerenciar Estoque pode estender Buscar Produto
        buscarProduto.acoes.addAll(acoesGerenciarEstoque);

        // Imprimindo o diagrama de caso de uso
        System.out.println("Diagrama de Caso de Uso - Comércio Eletrônico");
        System.out.println("Ator: " + usuario.nome);
        System.out.println("Ator: " + sistema.nome);
        System.out.println();
        System.out.println("Casos de Uso:");
        CasoDeUso[] casosDeUso = {buscarProduto, adicionarCarrinho, finalizarCompra, visualizarPedido, gerenciarEstoque};
        for (int i = 0; i < casosDeUso.length; i++) {
            System.out.println((i + 1) + ". " + casosDeUso[i].nome + ": " + casosDeUso[i].acoes);
        }
    }
}
