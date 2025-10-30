package PrimeiroProjeto;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //java.util
		
		//Mostrando os números até 10
		for(int cont = 0; cont <= 10;cont++) {
			System.out.println(cont);
		}
		
		//Mostrando uma mensagem
		System.out.println("Quantas vezes quer ver a mensagem? ");
		int escolha = scanner.nextInt();
		
		for (int texto = 1; texto <=3; texto++) {
			System.out.println("Hoje é quinta");
		}
		System.out.println("------------------");
		/*Peça cinco salários para o usuário, se o salário for menor ou igual* a 1500, mostre "você terá um aumento", senão, mostre "sem aumento"*/
		for (int voltas = 1;voltas <= 5; voltas++) {
		System.out.println("Qual seu salário?");
		double salario = scanner.nextDouble();
		if(salario <= 1500) {
			System.out.println("Você terá um aumento");
		} else {
			System.out.println("sem aumento");
			
			
			
			
			
			
		}

	}
	}
}

