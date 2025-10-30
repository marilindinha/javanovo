package PrimeiroProjeto;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int[] idade = new int[5]; //vetor inteiro de 5 posições 
		idade[0] = 18; //0
		idade[1] = 27; //1
		idade[2] = 13; //2
		idade[3] = 50; //3
		idade[4] = 40; //4
		System.out.println(idade[3]);
		
		System.out.println("---------------");
		String[] nomes = new String[4];
		for(int i = 0; i < 4; i++) { //gravando dados no vetor
			System.out.println("nomes["+i+"]: ");
			nomes[i] = sc.next();		
		}
		System.out.println("Mostrando os valores armazenados");
		for(int i = 0; i < 4; i++) { //mostrando os dados gravados
			System.out.println(nomes[i]);
		}
		System.out.println("Mostrando os valores invertidos");
		for (int i = 3; i>=0; i--) {
			System.out.println(nomes[i]);
		}
		
		//Reaproveitando o vetor idades
		for(int i = 0; i<5; i++) {
			if (idade[i] > 18) {
				System.out.println("Maior de idade");
			} else {
				System.out.println("Menor de idade");
			}
			
			
			
			
			
			
		}
		

	}

}
