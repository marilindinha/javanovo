package PrimeiroProjeto;

import java.util.Scanner;

public class While {
	public static void main(String[]args) {

	Scanner scanner = new Scanner (System.in); //java.util
	
	int numero =1;
	while(numero <= 5) {
		System.out.println(numero);
		numero++; //+1
	}
	int num = 5;
	while(num >= 1) {
		System.out.println(num);
		num--; //-1
	}
	
	int soma = 0;
	int valor;
	int contador = 1;
	
	System.out.println("Digite 3 números: ");
	while (contador <= 3) {
		valor = scanner.nextInt();
		soma += valor;
		contador += 1;
	} 
	System.out.println("A soma dos números é:" + soma);
	
	System.out.println("Digite Sair para sair do sistema");
	String resposta = scanner.next();
	
	while(!resposta.equalsIgnoreCase("Sair")) {
	System.out.println("Teste novamente");
	resposta = scanner.next();
} 
	System.out.println("Você conseguiu sair");
	
	/*Peça um valor para o usuário e mostre os números do 1 até chegar no número que ele digitou*/
	System.out.println("Digite um valor: ");
	int valor02 = scanner.nextInt();
	int aux = 1;
	while(aux <= valor02) {
		System.out.println(aux);
		aux++;
	}
	
	/*Peça um numero para o usuario e continue pedindo enquanto o número for
	 * diferente de 7*/
	System.out.println("Digite um número");
	int sete = scanner.nextInt();
	while(sete != 7) {
		System.out.println("Tente outro número");
		sete = scanner.nextInt();
	}
	System.out.println("Você conseguiu!");
	
}
}
