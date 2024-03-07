public class Main {
    public static void main(String[] args) {
        int numeroDias = 7; // Substitua pelo número desejado de dias

        // Vendas diárias (exemplo)
        double[] vendasDiarias = { 50.0, 60.0, 45.0, 70.0, 55.0, 80.0, 65.0 };

        // Inicialização de variáveis
        double totalVendas = 0;
        double estoqueMinimo = vendasDiarias[0]; // Assume o primeiro valor como mínimo
        double estoqueMaximo = vendasDiarias[0]; // Assume o primeiro valor como máximo

        // Loop para cálculos
        for (double vendaDiaria : vendasDiarias) {
            // Atualizar total de vendas
            totalVendas += vendaDiaria;

            // Atualizar estoque mínimo
            if (vendaDiaria < estoqueMinimo) {
                estoqueMinimo = vendaDiaria;
            }

            // Atualizar estoque máximo
            if (vendaDiaria > estoqueMaximo) {
                estoqueMaximo = vendaDiaria;
            }
        }

        // Calcular venda média diária
        double vendaMediaDiaria = totalVendas / numeroDias;

        // Exibir resultados
        System.out.println("Venda Média Diária: " + vendaMediaDiaria);
        System.out.println("Estoque Mínimo: " + estoqueMinimo);
        System.out.println("Estoque Máximo: " + estoqueMaximo);
    }
}
