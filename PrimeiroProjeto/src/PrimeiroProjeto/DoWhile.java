package PrimeiroProjeto;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int contador = 11;
		do{
			System.out.println("Do ... While");
		} while(contador <= 10);

		while(contador <= 10) {
		System.out.println("While");
		}
		System.out.println("----------------------");
		int numero = 0;
		do {
			System.out.println(numero);
			numero += 5; //+5
		} while(numero<=20);
		System.out.println("---------------------");
		Scanner sc = new Scanner(System.in);
		int secreto = 5;
		int escolha = 0;
		do {
			System.out.println("Escolha um número: ");
			escolha = sc.nextInt();
			if (escolha > secreto) {
				System.out.println("é menoor");
			} else if (escolha < secreto) {
				System.out.println("é maior");
			}
		} while (secreto != escolha);
		System.out.println("Acertouu");
		System.out.println("---------------------------");
		
		
		System.out.println("Escolha uma opção do menu");
		System.out.println("1 - ficar na navegação");
		System.out.println("2- sair da navegação");
		int opcao = sc.nextInt();
		do {
			System.out.println("Escolha novamente uma opçao do menu");
			opcao = sc.nextInt();
			
		}while (opcao != 2);
		
	}
}
