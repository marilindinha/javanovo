package PrimeiroProjeto;

import java.util.Scanner;

public class Lista20 {

	Scanner sc = new Scanner(System.in);

    // 1 – Repetindo uma saudação
    static void repetirSaudacao() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Bom dia!");
        }
    }

    // 2 – Desenhando um retângulo
    static void desenharRetangulo() {
        for (int i = 0; i < 3; i++) {
            System.out.println("*****");
        }
    }

    // 3 – Imprimindo múltiplos de 5
    static void imprimirMultiplosDe5() {
        for (int i = 5; i <= 25; i += 5) {
            System.out.println(i);
        }
    }

    // 4 – Exibindo uma contagem crescente
    static void contagemCrescente() {
        for (int i = 1; i <= 8; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nPronto!");
    }

    // 5 – Mostrando os meses do ano
    static void mostrarMeses() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        for (String mes : meses) {
            System.out.println(mes);
        }
    }

    // 1 – Verificando divisibilidade
    static void verificarDivisibilidade(int numero) {
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5.");
        } else {
            System.out.println(numero + " não é divisível por 5.");
        }
    }

    // 2 – Mensagem de despedida
    static void despedida(String nome) {
        System.out.println("Até logo, " + nome + "!");
    }

    // 3 – Unindo nomes
    static void unirNomes(String primeiroNome, String sobrenome) {
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
    }

    // 4 – Verificando maior que 100
    static void verificarMaiorQue100(int numero) {
        if (numero > 100) {
            System.out.println(numero + " é maior que 100.");
        } else {
            System.out.println(numero + " não é maior que 100.");
        }
    }

    // 5 – Classificando velocidade
    static void classificarVelocidade(int velocidade) {
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
    }

    // 6 – Saudação por dia da semana
    static void saudacaoPorDia(String dia) {
        System.out.println("Tenha uma ótima " + dia + "!");
    }

    // 7 – Verificando situação de estoque
    static void verificarEstoque(int quantidade) {
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
    }

    // ---------- Testando as funções ----------
    public static void main(String[] args) {
        // Chamadas de exemplo:
        repetirSaudacao();
        desenharRetangulo();
        imprimirMultiplosDe5();
        contagemCrescente();
        mostrarMeses();

        verificarDivisibilidade(15);
        despedida("Mariana");
        unirNomes("Julieta", "Correia");
        verificarMaiorQue100(75);
        classificarVelocidade(90);
        saudacaoPorDia("terça-feira");
        verificarEstoque(4);
    }
}
