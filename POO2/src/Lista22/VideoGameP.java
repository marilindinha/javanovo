package Lista22;

import java.util.Scanner;

public class VideoGameP {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  VideoGame vg = new VideoGame();
	        vg.marca = "Sony";
	        vg.modelo = "PlayStation 5";
	        vg.ligar();
	        vg.verificarStatus();
	        vg.desligar();
	        vg.verificarStatus();

	}

}