package PrimeiroProjeto;

import java.util.Scanner;

public class lista12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
	// 1 - Contador: Mostre os números de 10 a 30 no console
	int cont1 = 10;
	do {
		System.out.println(cont1);
		cont1++;
		} while (cont1 <= 30);
	System.out.println("---------------------");
	
	// 2 - Adivinhação de número: até digitar 5
	int numero2;
	do {
		System.out.println("Digite um número: ");
		numero2 = sc.nextInt();
		} while (numero2 != 5);
	System.out.println("Acertou o número!");
	System.out.println("---------------------");
	
	// 3 - Verificação de peso na mala
	int peso;
	do {
		System.out.print("Digite o peso da mala em kg: ");
		peso = sc.nextInt();
		if (peso > 23) {
			System.out.println("Peso excedido! Tente novamente.");
            }
	} while (peso > 23);
	System.out.println("Peso dentro do limite permitido!");
    System.out.println("---------------------");

    // 4 - Verificar quantidade de páginas lidas na semana
    int dia = 1;
    int totalPaginas = 0;
    do {
    	System.out.print("Digite as páginas lidas no dia " + dia + ": ");
        int paginas = sc.nextInt();
        totalPaginas += paginas;
        dia++;
        } while (dia <= 7);
    System.out.println("Total de páginas lidas na semana: " + totalPaginas);
    System.out.println("---------------------");

    // 5 - Testar código de acesso
    int codigo;
    do {
    	System.out.print("Digite o código de acesso (3 dígitos): ");
    	codigo = sc.nextInt();

    if (codigo != 789) {
    System.out.println("Código incorreto, tente novamente.");
            }
    } while (codigo != 789);
    System.out.println("Acesso liberado!");
    System.out.println("---------------------");

    // 6 - Verificar nível de combustível
    int combustivel;
    do {
    	System.out.print("Digite o nível de combustível em litros: ");
    	combustivel = sc.nextInt();

    if (combustivel <= 10) {
    	System.out.println("Combustível baixo!");
            }
        } while (combustivel <= 10);
        System.out.println("Combustível suficiente para viagem!");
        System.out.println("---------------------");

   // 7 - Contar quilômetros percorridos
   int distancia;
   int totalKm = 0;
   do {
	   System.out.print("Digite a distância percorrida neste trecho: ");
       distancia = sc.nextInt();

       if (distancia > 0) {
    	   totalKm += distancia;
            }
        } while (distancia > 0);
        System.out.println("Total de quilômetros percorridos: " + totalKm);
	}

}