package PrimeiroProjeto;

import java.util.Scanner;

public class Lista18 {

    // 1 – Apresentação
    public static void apresentacao() {
        for (int contador = 0; contador < 5; contador++) {
            System.out.println("Meu nome é Mariana Correia!");
        }
    }

    // 2 – Exibindo uma frase
    public static void fraseMotivacional() {
        String mensagem = "O futuro depende do que você faz hoje!";
        System.out.println(mensagem);
    }

    // 3 – Imprimindo valores
    public static void imprimirUmADez() {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

    // 4 – Mostrando as vogais
    public static void mostrarVogais() {
        char[] letrasVogais = {'A', 'E', 'I', 'O', 'U'};
        for (char letra : letrasVogais) {
            System.out.println(letra);
        }
    }

    // 5 – Desenhando um quadrado
    public static void desenharQuadrado() {
        int lado = 5;
        for (int linha = 0; linha < lado; linha++) {
            for (int coluna = 0; coluna < lado; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 6 – Imprimindo números pares
    public static void imprimirPares() {
        for (int par = 2; par <= 20; par += 2) {
            System.out.println(par);
        }
    }

    // 7 – Exibindo uma contagem regressiva
    public static void contagemRegressiva() {
        for (int contador = 10; contador >= 1; contador--) {
            System.out.println(contador);
        }
        System.out.println("Fim!");
    }

    // 8 – Desenhando um triângulo
    public static void desenharTriangulo() {
        for (int linha = 1; linha <= 5; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 9 – Mostrando os dias da semana
    public static void diasDaSemana() {
        String[] semana = {"Domingo", "Segunda-feira", "Terça-feira", 
                           "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
        for (String diaAtual : semana) {
            System.out.println(diaAtual);
        }
    }

    // Programa principal para testar
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        apresentacao();
        System.out.println("----");
        fraseMotivacional();
        System.out.println("----");
        imprimirUmADez();
        System.out.println("----");
        mostrarVogais();
        System.out.println("----");
        desenharQuadrado();
        System.out.println("----");
        imprimirPares();
        System.out.println("----");
        contagemRegressiva();
        System.out.println("----");
        desenharTriangulo();
        System.out.println("----");
        diasDaSemana();

        entrada.close();
    }
}
