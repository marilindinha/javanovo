package PrimeiroProjeto;

import java.util.Scanner;

public class Lista17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1 – Matriz 2x3
        int[][] m1 = new int[2][3];
        System.out.println("Preencha a matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("m1[" + i + "][" + j + "] = ");
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        // 2 – Nomes 3x2
        String[][] m2 = new String[3][2];
        sc.nextLine(); // limpar buffer
        System.out.println("\nPreencha a matriz 3x2 de nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("m2[" + i + "][" + j + "] = ");
                m2[i][j] = sc.nextLine();
            }
        }
        System.out.println("Tabela de nomes:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }

        // 3 – Diagonal 3x3
        int[][] m3 = new int[3][3];
        System.out.println("\nPreencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("m3[" + i + "][" + j + "] = ");
                m3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.println(m3[i][i]);
        }

        // 4 – Procurando número
        int[][] m4 = new int[3][3];
        System.out.println("\nPreencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("m4[" + i + "][" + j + "] = ");
                m4[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um número para procurar: ");
        int n = sc.nextInt();
        boolean achou = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m4[i][j] == n) {
                    System.out.println("Encontrado em: [" + i + "][" + j + "]");
                    achou = true;
                }
            }
        }
        if (!achou) {
            System.out.println("Número não encontrado.");
        }

        // 5 – Maiores que 10
        int[][] m5 = new int[4][3];
        System.out.println("\nPreencha a matriz 4x3:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("m5[" + i + "][" + j + "] = ");
                m5[i][j] = sc.nextInt();
            }
        }
        System.out.println("Valores maiores que 10:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (m5[i][j] > 10) {
                    System.out.println("m5[" + i + "][" + j + "] = " + m5[i][j]);
                }
            }
        }

        sc.close();
    }
}
