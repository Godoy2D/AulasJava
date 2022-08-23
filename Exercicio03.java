package exercico;

import java.util.Scanner;

public class Exercicio03 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número desejado ");
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		
		System.out.println(numero1 * numero2);
		
		sc.close();
	}
	
}