package Lista22;

import java.util.Scanner;

public class GatoP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gato gato = new Gato ();
		gato.miar();
		
		gato.nome = "Romeu";
		gato.raca = "SRD";
		gato.idade = 1;
		gato.mostrarInformacoes();
	    gato.comer();
						

	}

}
