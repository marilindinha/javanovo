package PrimeiroProjeto;

import java.util.Scanner;

public class Lista10 {
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
	//1 - Contador:
	int numero =1;
	while(numero <= 30) {
		System.out.println(numero);
		numero++; //+1
	}
	
	//2 - Soma de Números Digitados:
	System.out.println("------------------------------------------------");
	int c=0;
	while(c>=10) {
		System.out.println(c);
		c+=2;
	}
	
	//3 - Multiplicação de Números Digitados:
	System.out.println("------------------------------------------------");
	Scanner sc=new Scanner(System.in);
	int contador2=1;
	int soma=0;
	while(contador2<=3) {
		System.out.println("Digite o número "+contador2+":");
		int num=sc.nextInt();
		soma=soma+num;
		contador2++;
		System.out.println("A soma é: "+soma);
	}
	
	int contador3 = 1;
	int mult = 1;

	while (contador3 <= 5) {
	    System.out.println("Digite o número " + contador3 + ":");
	    int num2 = sc.nextInt();
	    mult = mult * num2; 
	    contador3++;
	}

	System.out.println("O resultado da multiplicação é: " + mult);

	
	//4 - Contar até o número informado:
	System.out.print("Digite um número: ");
	int num3 = sc.nextInt();

	int i = 1;
	while (i <= num3) {
	    System.out.println(i);
	    i++;
	}
	
	//5 - Somar os números de 1 a 5:
	int conta = 0;
	int j = 1;

	while (j <= 5) {
	    conta += j;
	    j++;
	}

	System.out.println("A soma de 1 a 5 é: " + conta);
	
	//6 - Tabuada
	System.out.print("Digite um número para ver a tabuada: ");
	int tabu = sc.nextInt();

	int t = 1;
	while (t <= 10) {
	    System.out.println(tabu + " x " + t + " = " + (tabu * t));
	    t++;
	}



	
	
	
	}
}
