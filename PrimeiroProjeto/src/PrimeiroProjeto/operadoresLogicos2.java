package PrimeiroProjeto;

import java.util.Scanner;

public class operadoresLogicos2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //java.util
		
		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();
		System.out.println("Tem título de eleitor?");
		String resposta = scanner.next();
		
		if(idade >= 16 && resposta.equalsIgnoreCase("SIM")) {
			System.out.println("Pode votar");
		} else {
			System.out.println("Não pode votar");
		}
		
		int numero;
		System.out.println("Informe um número: ");
		numero = scanner.nextInt();
		// ou 
		if(numero >=10 || numero <= 20) {
			System.out.println("O número está no intervalo");
		} else {
			System.out.println("O número está fora");
		}
		
		//compra > 200
		System.out.println("Qual o valor da compra? ");
		double valor = scanner.nextDouble();
		System.out.println("é cliente VIP? ");
		boolean vip = scanner.nextBoolean();
		
		if(valor > 200 && vip == true) { //false
			double desconto = valor * 0.15;
			double valorFinal = valor - desconto;
			System.out.printf("Vai pagar: %.2f", valorFinal);
		} else {
			System.out.println("Não tem desconto");
		}
		
		/*Para participar de um worshop precisa ter idade entre 20 e 40 anos e possuir experiência. 
		 *Se as informações forem verdadeiras exiba "Iscrição aceita", senão "Inscrição rejeitada"*/
		
		System.out.println("Qual é a sua idade? ");
		int idade2 = scanner.nextInt();
		System.out.println("Você possui experiência? ");
		String experiencia = scanner.next();
		if (idade2 >20 && idade2 <40 && experiencia.equalsIgnoreCase("SIM")) {
			System.out.println("Incrição aceita");
		} else {
			System.out.println("Incrição rejeitada");
		}
		
	

	}

}
