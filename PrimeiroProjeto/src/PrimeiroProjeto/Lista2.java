package PrimeiroProjeto;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		//1 - Resultado de dois números
		Scanner scanner = new Scanner(System.in);
		double numero1, numero2;
		System.out.println("Informe um Número: ");
		numero1 = scanner.nextDouble();
		System.out.println("Informe outro Número (o número não pode ser zero): ");
		numero2 = scanner.nextDouble();
		
		double soma = numero1 + numero2;
		double sub = numero1 - numero2;
		double mult = numero1 * numero2;
		double div = numero1 / numero2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+sub);
		System.out.println("Multiplicação: "+mult);
		System.out.println("Divisão: "+div);
		System.out.println("\n");

		//2 - Cálculo de temperatura
		int temperatura;
		System.out.println("Informe a temperatura ");
		temperatura = scanner.nextInt();
		double fahrenheit = (temperatura * 1.8) + 32;
		System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
		System.out.println("\n");

		//3 - Conversão de valor
		int real;
		System.out.println("Informe um valor em reais ");
		real = scanner.nextInt();
		double dolar = real / 5.70;
		System.out.println("O valor em dólar é " + dolar);
		System.out.println("\n");

		//4 - Área do retângulo
		int base;
		System.out.println("Qual é a base do triângulo? ");
		base = scanner.nextInt();
		int altura;
		System.out.println("Qual é a altura do triângulo? ");
		altura = scanner.nextInt();
		double area = base * altura;
		System.out.println("A área do triângulo é: " + area);
		System.out.println("\n");

		//5 - Conversor de idade
		int idade;
		System.out.println("Qual é a sua idade? ");
		idade = scanner.nextInt();
		int meses = idade * 12;
		System.out.println("A sua idade em meses é " + meses);
		System.out.println("\n");

		//6 - Conversor de minutos para segundos
		int min;
		System.out.println("Informe um tempo em minutos: ");
		min = scanner.nextInt();
		int seg = min * 60;
		System.out.println("O tempo em segundos é " + seg);
		System.out.println("\n");
		
		//7 - Custo da compra
		System.out.print("Digite o preço do produto: ");
	    double preco = scanner.nextDouble();
	    System.out.print("Digite a quantidade comprada: ");
	    int quantidade = scanner.nextInt();
	    double total = preco * quantidade;
	    System.out.printf("O custo total é R$"+ total);
		System.out.println("\n");

	        
	    // 8 - Divisão da conta de restaurante
	    System.out.print("Digite o valor total da conta: ");
	    double valorTotal = scanner.nextDouble();
	    System.out.print("Digite o número de pessoas: ");
	    int pessoas = scanner.nextInt();
	    double valorPP = valorTotal / pessoas;
	    System.out.printf("Cada pessoa deve pagar R$" + valorPP);
		System.out.println("\n");

	       
	    // 9 - Cálculo de troco
	    System.out.print("Digite o valor da compra: ");
	    double valorCompra = scanner.nextDouble();
	    System.out.print("Digite o valor pago: ");
	    double valorPago = scanner.nextDouble();
	    double troco = valorPago - valorCompra;
	    System.out.printf("O troco é R$" + troco);


		

		
		
		
		
		
		
		
		
				
				

		

		


		


		

	}

}
