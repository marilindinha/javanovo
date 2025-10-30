package PrimeiroProjeto;

import java.util.Scanner;

public class Lista7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1 - Classificação de Filme
		System.out.println("Qual sua idade?");
		int idade = scanner.nextInt();
		if (idade >16 && idade <70) {
			System.out.println("Classificação especial");
		} else {
			System.out.println("Classificação regular");
		}
		
		//2 - Promoção de Produto
		System.out.println("Qual o valor do produto?");
		int valor = scanner.nextInt();
		System.out.println("Qual foi a quantidade comprada?");
		int quantidade = scanner.nextInt();
		double valor2 = valor * quantidade;
		if (valor2 >200 && quantidade > 5) {
		double valorfinal = valor2 * 0.85;
		System.out.printf("Vai pagar: %.2f", valorfinal);
		} else {
		System.out.println("Não tem desconto");
		}
		
		//3 - Alerta de Saúde
		System.out.println("Qual é a sua frequência cardíaca (em pbm)? ");
		int frequencia = scanner.nextInt();
		System.out.println("Você sente tontura?");
		String tontura = scanner.next();
		if (frequencia >= 100 && tontura.equalsIgnoreCase("SIM")) {
			System.out.println("Procure atendimento médico");
		} else {
			System.out.println("Sem sinais de alerta");
		}
		
		// 4 - Participação em Concurso
        System.out.println("\nInforme a idade do candidato:");
        int idadeConc = scanner.nextInt();
        System.out.println("É residente do estado? (sim/nao)");
        String residente = scanner.next();
        if (idadeConc >= 18 && idadeConc <= 30 && residente.equalsIgnoreCase("sim")) {
            System.out.println("Elegível para o concurso");
        } else {
            System.out.println("Não elegível para o concurso");
        }

        // 5 - Recompensa por Desempenho
        System.out.println("\nNúmero de projetos concluídos:");
        int projetos = scanner.nextInt();
        System.out.println("Número de erros reportados:");
        int erros = scanner.nextInt();
        if (projetos > 10 && erros < 3) {
            System.out.println("Recompensa concedida");
        } else {
            System.out.println("Sem recompensa");
        }

        // 6 - Autorização para Viagem
        System.out.println("\nInforme a idade:");
        int idadeViagem = scanner.nextInt();
        System.out.println("Possui passaporte válido? (sim/nao)");
        String passaporte = scanner.next();
        if (idadeViagem >= 18 && passaporte.equalsIgnoreCase("sim")) {
            System.out.println("Viagem autorizada");
        } else {
            System.out.println("Viagem não autorizada");
        }

        // 7 - Aprovação em Curso Online
        System.out.println("\nInforme a nota final (0 a 100):");
        int nota = scanner.nextInt();
        System.out.println("Informe o número de aulas assistidas (0 a 50):");
        int aulas = scanner.nextInt();
        if (nota >= 70 && aulas >= 40) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        // 8 - Controle de Irrigação
        System.out.println("\nInforme a umidade do solo (%):");
        int umidade = scanner.nextInt();
        System.out.println("Informe a temperatura (°C):");
        int temp = scanner.nextInt();
        if (umidade < 30 || temp > 30) {
            System.out.println("Irrigação necessária");
        } else {
            System.out.println("Irrigação não necessária");
        }

        // 9 - Inscrição em Feira Profissional
        System.out.println("\nInforme a idade:");
        int idadeFeira = scanner.nextInt();
        System.out.println("Possui experiência prévia? (sim/nao)");
        String experiencia = scanner.next();
        if (idadeFeira >= 20 && idadeFeira <= 40 && experiencia.equalsIgnoreCase("sim")) {
            System.out.println("Inscrição aceita");
        } else {
            System.out.println("Inscrição não permitida");
        }
       
		
		
		

		
	


	}

}