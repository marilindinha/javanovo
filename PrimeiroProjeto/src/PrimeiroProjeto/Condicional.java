package PrimeiroProjeto;

import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		/* >= maior ou igual           <= menor ou igual
		 * > maior                     < menor	 
		 * == igual                    != diferente */
			int idade = 18;
			 if(idade >= 18) {
				 System.out.println("Você é maior de idade");
			 } else {
				 System.out.println("Você é menor de idade");
			 }
			Scanner scanner = new Scanner(System.in);
			//Verificação de desconto
			System.out.println("Quanto você pagou");
			double valor = scanner.nextDouble();
			if(valor >= 200) {
				System.out.println("Você ganhou desconto");
			} else {
				System.out.println("Você não ganhou desconto");
			}
			//------------------------------------------------------
			String continuar;
			System.out.println("Deseja Continuar? ");
			continuar = scanner.next();
			if(continuar == "sim") {
				System.out.println("Você escolheu continuar");
			} else {
				System.out.println("Você escolheu sair");
			}
			double nota1, nota2;
			System.out.println("Informe a nota 1: ");
			nota1 = scanner.nextDouble();
			System.out.println("Informe a nota 2: ");
			nota2 = scanner.nextDouble();
			double media = (nota1 + nota2)/ 2;
			
		if (media < 7) {
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
		
		/*Aplicação de desconto: Peça o valor da compra para o usuári
		se o valor for maior ou igual a 200, o usuário recebe um
		desconto de 15%, senão não tem desconto. Mostre se ele
		teve algum desconto e quanto deve pagar*/
		double valorC;
		double desc = 0;
		System.out.println("Qual valor da compra? ");
		valor = scanner.nextDouble();
		
		if(valor >= 200) {
			desc = valor * 0.15;
		}
		double preco = valor - desc;
		System.out.println("Desconto: " + desc);
		System.out.println("Valor Final: " + preco);
			}
	}


