package exercicios;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua Idade: ");
		int n = sc.nextInt();
		
		if(n < 5) {
			System.out.println("Nenhuma Categoria");
		} else if(n < 7){
			System.out.println("Categoria Infantil");
		} else if(n < 10){
			System.out.println("Categoria Juvenil");
		} else if(n < 15){
			System.out.println("Categoria Adolescente");
		} else if(n < 30){
			System.out.println("Categoria Adulto");
		} else{
			System.out.println("Categoria Sênior");
		}
			
		sc.close();
	}

}
