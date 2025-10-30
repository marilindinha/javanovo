package PrimeiroProjeto;

public class Lista19 {

    // 1 – Classificando valores
    public static void valor(int n) {
        if (n > 0) {
            System.out.println(n + " é Positivo");
        } else if (n < 0) {
            System.out.println(n + " é Negativo");
        } else {
            System.out.println(n + " é Zero");
        }
    }

    // 2 – Maioridade
    public static void idade(int i) {
        if (i >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

    // 3 – Boas Vindas
    public static void boas(String nome) {
        System.out.println("Bem-vindo(a), " + nome + "!");
    }

    // 4 – Tabuada
    public static void tab(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 5 – Juntando palavras
    public static void juntar(String p1, String p2) {
        System.out.println(p1 + p2);
    }

    // 6 – Verificando par ou ímpar
    public static void parImpar(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " é Par");
        } else {
            System.out.println(n + " é Ímpar");
        }
    }

    // 7 – Classificando temperatura
    public static void temp(double t) {
        if (t < 15) {
            System.out.println("Frio");
        } else if (t <= 25) {
            System.out.println("Agradável");
        } else {
            System.out.println("Quente");
        }
    }

    // 8 – Saudação por turno
    public static void turno(String t) {
        switch (t.toLowerCase()) {
            case "manhã":
                System.out.println("Bom dia!");
                break;
            case "tarde":
                System.out.println("Boa tarde!");
                break;
            case "noite":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Turno inválido.");
        }
    }

    // 9 – Calculando média
    public static void media(double n1, double n2, double n3) {
        double m = (n1 + n2 + n3) / 3.0;
        System.out.println("Média: " + m);
    }

    // 10 – Verificando aprovação
    public static void nota(double n) {
        if (n >= 7) {
            System.out.println("Aprovado");
        } else if (n >= 5) {
            System.out.println("Em recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void main(String[] args) {
        valor(10);
        valor(-3);
        valor(0);

        idade(16);
        idade(20);

        boas("Mari");

        tab(7);

        juntar("Java", "Top");

        parImpar(9);
        parImpar(12);

        temp(10);
        temp(20);
        temp(30);

        turno("manhã");
        turno("tarde");
        turno("noite");

        media(8, 7, 6);

        nota(8);
        nota(6);
        nota(4);
    }
}
