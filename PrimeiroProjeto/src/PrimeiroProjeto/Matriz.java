package PrimeiroProjeto;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		matriz [0][0] = 20;
		matriz [0][1] = 30;
		matriz [0][2] = 12;
		matriz [1][0] = 40;
		
		System.out.println(matriz[0][2]);
		
		
		int [][] numeros = new int [2][3];
		for(int i  = 0; i <2; i++ ) {
			for(int j = 0; j<3; j++) {
				System.out.println("numeros ["+i+"] ["+j+"]");
				
				numeros [i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.println(numeros[i][j]);
			}
			System.out.println("");
		}


}

}