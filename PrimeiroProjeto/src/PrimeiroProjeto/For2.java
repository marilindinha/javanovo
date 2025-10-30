package PrimeiroProjeto;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int cont = 1; cont <= 10; cont++) {
			System.out.println(cont);
		}
		System.out.println("--------------------");
		
		
		System.out.println("Até que número voê quer que eu conte?");
		int num = sc.nextInt();
		for (int vez = 1; vez <= num; vez++) {
			System.out.println(vez);
		}
		System.out.println("--------------------");
		
		
		
		//número par
		for (int i = 0; i <= 5; i++) {
			System.out.println("Escolha um número: ");
			int nu2 = sc.nextInt();
			int div = nu2 % 2;
			if (div ==0) {
				System.out.println("O número é par!");
			}else {
				System.out.println("O número é impar!");
			}
		}
		System.out.println("--------------------");
		
		
		
		int soma = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Informe um valor: ");
			int valor = sc.nextInt();
			soma = soma + valor;
		}
		System.out.println("A soma é: "+soma);
		System.out.println("--------------------");
	}

}
