package exercicios;
import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {

		double carlos = 3000, joao = (carlos / 3);
		int meses = 0;
		
		while(joao < carlos) {
			carlos = carlos * 1.02;
			joao = joao * 1.05;
			meses++;
		}
		
		System.out.println(
				"Carlos: R$ " + carlos + "\n" +
				"João: R% " + joao + "\n" +
				"Meses: " + meses
		);

	}

}
