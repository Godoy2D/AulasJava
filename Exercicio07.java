package exercico;

import java.util.Scanner;

// 3) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²

public class Exercicio07 {

	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a base do quadrado: ");
		int numero1 = sc.nextInt();

		System.out.println("Digite a altura do quadrado: ");
		int numero2 = sc.nextInt();
		
		System.out.println(numero1 * numero2 / 2);
		sc.close();
	}
	
}
