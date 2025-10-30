package PrimeiroProjeto;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		int contador=1;
		while(contador<=5) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("------------------------------------------------");
		int cont=5;
		while(cont>=1) {
			System.out.println(cont);
			cont--;
		}
		System.out.println("------------------------------------------------");
		int c=0;
		while(c>=10) {
			System.out.println(c);
			c+=2;
		}
		System.out.println("------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		int contador2=1;
		int soma=0;
		while(contador2<=5) {
			System.out.println("Digite o número "+contador2+":");
			int numero=sc.nextInt();
			soma=soma+numero;
			contador2++;
			System.out.println("A soma é: "+soma);
		}
		System.out.println("------------------------------------------------");
		//Enquanto digitar para "ficar" o código continua
		System.out.println("O que deseja? ");
		String texto = sc.next();
		
		while(texto.equalsIgnoreCase("ficar")) {
			System.out.println("O que deseja? ");
			texto = sc.next();
		}
		System.out.println("Saiu");
		System.out.println("------------------------------------------------");
		//Quando o usuário digitar "sair" o código para
		System.out.println("o que deseja? ");
		String resposta = sc.next();
		while (!resposta.equalsIgnoreCase("sair" )) {
			System.out.println("O que deseja? ");
			resposta = sc.next();
		}
		System.out.println("Você saiu");
		
		
		
		
		
		
		
		
		
		
	}

}