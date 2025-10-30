package PrimeiroProjeto;

import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in); //java.util
			
			System.out.println("Qual a sua idade? ");
			int idade = scanner.nextInt();
			System.out.println("Você tem ingressos? (true/false):");
			boolean ingresso = scanner.nextBoolean();
			
			if(idade >= 18 && ingresso) {
				System.out.println("Entrada Permitida");
			} else {
				System.out.println("Entrada Negada");
			}
			
			System.out.println("------------------------------------");
			System.out.println("Qual sua nota? ");
			double nota = scanner.nextDouble();
			System.out.println("Qual sua frequência? (0 a 100)");
			int frequencia = scanner.nextInt();
			
			if(nota >= 7 || frequencia >= 75) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			
			System.out.println("-------------------------------------------");
			/* Para logar o usuário precisa responder uma série de perguntas,
			 * se ele é o administrador e se está logado
			 */
			System.out.println("É admin? (true/false)");
			boolean admin = scanner.nextBoolean();
			System.out.println("Está Logado? (true/false)");
			boolean logado = scanner.nextBoolean();

			if(admin && logado) {
			System.out.println("Acesso permitido");
			} else {
			System.out.println("Acesso Negado");
			}
			
			System.out.println("-------------------------------------------");
			/*Peça uma letra para o usuário, se ela for A, E, I, O ou U
			 * mostre "vogal", senão, mostre consoante
			 */
			System.out.println("Digite uma letra: ");
			String letra = scanner.next();
			if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E")
					||letra.equalsIgnoreCase("I") 
					||letra.equalsIgnoreCase("O")
					||letra.equalsIgnoreCase("U")) {
				System.out.println("Vogal");
			} else {
				System.out.println("Consoante");
			}
		}
		

	}