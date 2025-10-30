package Lista22;

public class ProdutoP {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Camisa de Time";
        p1.preco = 199.90;
        p1.estoque = 10;

        Produto p2 = new Produto();
        p2.nome = "Chinelo Havaianas";
        p2.preco = 45.00;
        p2.estoque = 5;

        System.out.println("Informações iniciais:");
        p1.mostrarInformacoes();
        p2.mostrarInformacoes();

        System.out.println("Realizando uma venda...");
        p1.vender(3); // vende 3 camisas
        p2.vender(6); // tenta vender mais do que o estoque

        System.out.println("\nInformações atualizadas:");
        p1.mostrarInformacoes();
        p2.mostrarInformacoes();
    }
}
