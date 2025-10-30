package PrimeiroProjeto;

import java.util.Scanner;

public class Lista14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1 - Contador: 1 a 10
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
        System.out.println("------------------------");

        // 2 - Somando números de 1 a 100
        int somaTotal = 0;
        for (int numero = 1; numero <= 100; numero++) {
            somaTotal += numero;
        }
        System.out.println("Soma de 1 a 100: " + somaTotal);
        System.out.println("------------------------");

        // 3 - Imprimir números pares de 1 a 20
        for (int numero = 1; numero <= 20; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
        System.out.println("------------------------");

        // 4 - Tabuada
        System.out.print("Digite um número para ver a tabuada: ");
        int numeroTabuada = sc.nextInt();
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            System.out.println(numeroTabuada + " x " + multiplicador + " = " + (numeroTabuada * multiplicador));
        }
        System.out.println("------------------------");

        // 5 - Contar números divisíveis por 3 de 1 a 50
        int qtdDivisiveisPor3 = 0;
        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 3 == 0) {
                qtdDivisiveisPor3++;
            }
        }
        System.out.println("Quantidade de números divisíveis por 3: " + qtdDivisiveisPor3);
        System.out.println("------------------------");

        // 6 - Imprimir números ímpares de 1 até N
        System.out.print("Digite um número N: ");
        int limite = sc.nextInt();
        for (int numero = 1; numero <= limite; numero++) {
            if (numero % 2 != 0) {
                System.out.println(numero);
            }
        }
        System.out.println("------------------------");

        // 7 - Multiplicação de 5 valores informados
        int produto = 1;
        for (int contagem = 1; contagem <= 5; contagem++) {
            System.out.print("Digite o valor " + contagem + ": ");
            int valorInformado = sc.nextInt();
            produto *= valorInformado;
        }
        System.out.println("Resultado da multiplicação: " + produto);
        System.out.println("------------------------");

        // 8 - Premiação da empresa (10 funcionários)
        for (int funcionario = 1; funcionario <= 10; funcionario++) {
            System.out.print("Digite os anos de empresa do funcionário " + funcionario + ": ");
            int anosEmpresa = sc.nextInt();
            if (anosEmpresa > 10) {
                System.out.println("Parabéns! Você irá receber um prêmio");
            } else {
                System.out.println("Quase lá");
		

	}

}
}
}