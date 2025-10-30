package PrimeiroProjeto;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		mensagem();
		linha();
		linha();
		linha();
		contagem();
		saudacao("Juliana");
		//java.util
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a sua idade?");
		int idade = sc.nextInt();
		classificacao(idade);
		
		System.out.println("Quanto produtos comprou?");
		int quantidade = sc.nextInt();
		System.out.println("Qual o valor do produto?");
		double valor = sc.nextDouble();
		compra(quantidade, valor);

	}
public static void mensagem() {
	System.out.println("Função sem retorno");
}
public static void linha() {
	System.out.println("-----------------------");
}
public static void contagem() {
	for(int i = 1; i<=5; i++) {
		System.out.println(i);
	}
}
//Função com parâmetro
public static void saudacao(String nome) {
	System.out.println("Olá "+ nome);
}
public static void classificacao(int idade) {
	if(idade>=18) {
		System.out.println("Maior de idade");
	} else {
		System.out.println("Menor de idade");
	}
}
public static void compra(int quant, double valor) {
	double total = quant * valor;
	System.out.println("Pague: R$" + total);
}
}