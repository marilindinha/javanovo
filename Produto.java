package Lista22;

public class Produto {

    String nome;
    double preco;
    int estoque;

    void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso! " + quantidade + " unidades vendidas.");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
      
    }
}
