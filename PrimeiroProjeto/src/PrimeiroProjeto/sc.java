package PrimeiroProjeto;

import java.util.Scanner;

public class sc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número e veja uma cor: ");
		int numero = scanner.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Vermelho");
			break;
		case 2:
			System.out.println("Azul");
			break;
			default:
				System.out.println("Número Incorreto");
		
		}
		
		System.out.println("qual categoria você pertence?");
		String categoria = scanner.next();
		switch (categoria) {
		case "A":
			System.out.println("Infantil");
			break;
		case "B":
			System.out.println("Juvenil");
			break;
		default: 
			System.out.println("Categoria incorreta");
		
		}
		
		System.out.println("Escolha a operação matemática de dois números");
		String operacao = scanner.next();
		
		switch (operacao) {
		case "+":
			int adicao = 5 + 5;
			break;
		case "-":
			int subtracao = 5 - 5;
			break;
		case "*":
			int multi = 5 * 5;
			break;
		case "/":
			int divisao = 5 / 5;
			break;
			default:
				System.out.println("Operação incorreta");
			
		}

	}

}
