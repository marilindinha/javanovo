package SistemaCaixa;

import java.util.Scanner;

public class system  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cadastro de produtos (nomes e estoques)
        String[] produtos = {"Iphone 13 Pro Max Eclipse 128GB", "Iphone 15 Plus Roxo 512GB", "Ipad Air Preto 10ª Geração", "Iphone 17 Pro Max Laranja 1TB", "Iphone 14 Pro Branco 256GB", "Iphone 16 Rosa 512BG"};
        int[] estoque = {10, 5, 8, 12, 6, 7};

        // Solicita nome do cliente
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Bem-vindo à Apple, " + nome + "!\n");

        // Mostra produtos e estoque
        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + " - " + produtos[i] + " (Estoque: " + estoque[i] + ")");
        }

        // Escolha do produto
        System.out.print("\nEscolha o número do produto desejado: ");
        int escolha = sc.nextInt();
        if (escolha < 1 || escolha > produtos.length) {
            System.out.println("Opção inválida!");
            return;
        }

        String produtoEscolhido = produtos[escolha - 1];
        int qtdEstoque = estoque[escolha - 1];

        // Quantidade desejada
        System.out.print("Informe a quantidade desejada: ");
        int quantidade = sc.nextInt();
        if (quantidade <= 0) {
            System.out.println("Valor incorreto, informe pelo menos um produto!");
            return;
        }
        if (quantidade > qtdEstoque) {
            System.out.println("Não temos essa quantidade desse produto, tente outra quantidade!");
            return;
        }

        // Valor do produto
        System.out.print("Informe o valor unitário do produto R$: ");
        double valorUnitario = sc.nextDouble();

        // Cálculo do total
        double totalBruto = valorUnitario * quantidade;
        double desconto = 0;

        if (totalBruto > 200) {
            desconto = 0.15;
        } else if (totalBruto >= 100) {
            desconto = 0.10;
        } else {
            desconto = 0.05;
        }

        double valorComDesconto = totalBruto - (totalBruto * desconto);

        // Pergunta sobre parcelamento
        System.out.print("Deseja parcelar? (S/N): ");
        char resposta = sc.next().toUpperCase().charAt(0);

        double valorParcela = 0;
        int parcelas = 0;

        if (resposta == 'S') {
            System.out.print("Quantas parcelas (máximo 5)? ");
            parcelas = sc.nextInt();

            if (parcelas < 1 || parcelas > 5) {
                System.out.println("Número de parcelas inválido! Será considerado pagamento à vista.");
            } else {
                valorParcela = valorComDesconto / parcelas;
            }
        }

        // Mensagem final
        System.out.println("\n----- RESUMO DA COMPRA -----");
        System.out.println("Cliente: " + nome);
        System.out.println("Produto: " + produtoEscolhido);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor original: R$ " + String.format("%.2f", totalBruto));
        System.out.println("Desconto aplicado: " + (int)(desconto * 100) + "%");
        System.out.println("Valor com desconto: R$ " + String.format("%.2f", valorComDesconto));

        if (parcelas > 0 && parcelas <= 5) {
            System.out.println("Parcelado em " + parcelas + "x de R$ " + String.format("%.2f", valorParcela));
        } else {
            System.out.println("Pagamento à vista.");
        }

        System.out.println("-----------------------------");
        System.out.println("Obrigado pela compra, " + nome + "! Volte sempre!");
    }
}
