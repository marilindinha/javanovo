package PrimeiroProjeto;

import java.util.Scanner;

public class Lista21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        linha();
        System.out.println("Soma: " + somar(10, 5));

        linha();
        System.out.println("Subtração: " + subtrair(20, 8));

        linha();
        System.out.println("Multiplicação: " + multiplicar(6, 4));

        linha();
        System.out.println(dividir(10, 0));

        linha();
        System.out.println("Média: " + media(7.5, 8.0));

        linha();
        System.out.println("Situação: " + aprovacao(5.0, 9.0));

        linha();
        System.out.println(maior(15, 15));

        linha();
        System.out.println("Temperatura em Fahrenheit: " + temperatura(30));

        linha();
        System.out.println("Área do retângulo: " + area(5, 3));

        linha();
        System.out.println(mensagem("Juliana"));

        linha();
        System.out.println("Nomes juntos: " + nomes("Maria", "Souza"));

        linha();
        System.out.println("Classificação de idade: " + idade(61));

    }

    // Linha separadora
    public static void linha() {
        System.out.println("--------------------------------------------------");
    }

    // 1 - Somar
    public static int somar(int a, int b) {
        return a + b;
    }

    // 2 - Subtrair
    public static int subtrair(int a, int b) {
        return a - b;
    }

    // 3 - Multiplicar
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // 4 - Dividir
    public static String dividir(int a, int b) {
        if (b == 0) {
            return "Não é possível dividir por 0.";
        }
        return "Resultado da divisão: " + ((double) a / b);
    }

    // 5 - Calcular média
    public static double media(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // 6 - Verificar aprovação
    public static String aprovacao(double n1, double n2) {
        double media = media(n1, n2);
        if (media >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // 7 - Maior número
    public static String maior(int a, int b) {
        if (a > b) {
            return a + " é o maior número.";
        } else if (b > a) {
            return b + " é o maior número.";
        } else {
            return "Eles são iguais.";
        }
    }

    // 8 - Converter Celsius para Fahrenheit
    public static double temperatura(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // 9 - Calcular área do retângulo
    public static double area(double base, double altura) {
        return base * altura;
    }

    // 10 - Gerar mensagem
    public static String mensagem(String nome) {
        return "Olá, " + nome + "!";
    }

    // 11 - Juntar nomes
    public static String nomes(String nome1, String nome2) {
        return nome1 + " " + nome2;
    }

    // 12 - Avaliar idade
    public static String idade(int idade) {
        if (idade < 12) {
            return "Criança";
        } else if (idade < 18) {
            return "Adolescente";
        } else if (idade < 60) {
            return "Adulto";
        } else {
            return "Idoso";
        }
    }
}