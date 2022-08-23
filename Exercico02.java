package exercico;

import java.util.Scanner;

public class Exercico02 {

	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número desejado ");
		
		int numero = sc.nextInt();
		int menos = numero - 1;
		
		
		System.out.println( menos );
		
		sc.close();
	}
	
}
