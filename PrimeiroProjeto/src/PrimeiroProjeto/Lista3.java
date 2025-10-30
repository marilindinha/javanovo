package PrimeiroProjeto;

import java.util.Scanner;

public class Lista3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Exercício 1 - Resultado de dois números
		System.out.print("Digite o primeiro número inteiro: ");
		int num1 = scanner.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int num2 = scanner.nextInt();
		int soma = num1 + num2;
		System.out.println("A soma é: " + soma);
		System.out.println();

		// Exercício 2 - Divisão e Resto
		System.out.print("Digite o primeiro número inteiro: ");
		int n1 = scanner.nextInt();
		System.out.print("Digite o segundo número inteiro: ");
		int n2 = scanner.nextInt();
		int div = n1 / n2;
		int resto = n1 % n2;
		System.out.println("Divisão inteira: " + div);
		System.out.println("Resto da divisão: " + resto);
		System.out.println();

		// Exercício 3 - Perímetro de um triângulo
		System.out.print("Digite o lado 1 do triângulo: ");
		double l1 = scanner.nextDouble();
		System.out.print("Digite o lado 2 do triângulo: ");
		double l2 = scanner.nextDouble();
		System.out.print("Digite o lado 3 do triângulo: ");
		double l3 = scanner.nextDouble();
		double perimetro = l1 + l2 + l3;
		System.out.println("O perímetro do triângulo é: " + perimetro);
		System.out.println();

		// Exercício 4 - Calculadora de Gorjeta
		System.out.print("Digite o valor da conta (R$): ");
		double vConta = scanner.nextDouble();
		System.out.print("Digite a porcentagem da gorjeta: ");
		double porc = scanner.nextDouble();
		double gorj = vConta * (porc / 100);
		double total = vConta + gorj;
		System.out.println("Valor da gorjeta: R$" + gorj);
		System.out.println("Total a pagar: R$" + total);
		System.out.println();

		// Exercício 5 - Calculadora de área de círculo
		System.out.print("Digite o raio do círculo (em metros): ");
		double r = scanner.nextDouble();
		final double pi = 3.14159;
		double area = pi * r * r;
		System.out.println("A área do círculo é: " + area + " metros quadrados");
		System.out.println();

		// Exercício 6 - Conversor de idade em dias
		System.out.print("Digite a idade em anos: ");
		int anos = scanner.nextInt();
		System.out.print("Digite os meses: ");
		int mes = scanner.nextInt();
		System.out.print("Digite os dias: ");
		int dia = scanner.nextInt();
		int tDias = (anos * 365) + (mes * 30) + dia;
		System.out.println("Você viveu aproximadamente " + tDias + " dias.");
		System.out.println();

		// Exercício 7 - Calculadora de pagamento por hora
		System.out.print("Digite o número de horas trabalhadas: ");
		double hrs = scanner.nextDouble();
		System.out.print("Digite o valor pago por hora: ");
		double vHora = scanner.nextDouble();
		double sBruto = hrs * vHora;
		double imp = sBruto * 0.10;
		double sLiquido = sBruto - imp;
		System.out.println("Salário bruto: R$" + sBruto);
		System.out.println("Imposto (10%): R$" + imp);
		System.out.println("Salário líquido: R$" + sLiquido);
	}

}
