package PrimeiroProjeto;

import java.util.Scanner;

public class Lista9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1 - Contador:
		int numero =1;
		while(numero <= 10) {
			System.out.println(numero);
			numero++; //+1 
			}
			
		//2 - Contagem regressiva:
		int num = 10;
		while(num >= 1) {
			System.out.println(num);
			num--; //-1 
			}
			
		//3 - Sequência numérica:
		int n = 0;
		while (n <= 100) {
			System.out.println(n);
			n+=5; 
		}
		
		//4 - Mostrando mensagem:
		int mensagem =0;
		while(mensagem <=5) {
			System.out.println("Eu gosto de Java");
			mensagem++;
		}
		
		//5 - Soma de Números Digitados:
		int soma = 0;
		int valor;
		int contador = 1;
		
		System.out.println("Digite 5 números: ");
		while (contador <= 5) {
			valor = scanner.nextInt();
			soma += valor;
			contador += 1;
		} 
		System.out.println("A soma dos números é: " + soma);
	
		//6 - Validação de Senha:
		System.out.println("Digite a senha");
		int senha = scanner.nextInt();
		while(senha != 1234) {
			System.out.println("Tente outro número");
			senha = scanner.nextInt();
		}
		System.out.println("Você conseguiu!");

		//7 - Contagem Regressiva
				System.out.println("Digite um número para a contagem regressiva:");
				int contag = scanner.nextInt();
				while(contag >= 1) {
					System.out.println(contag);
					contag--;
				}
		

	}
		
}
		
	