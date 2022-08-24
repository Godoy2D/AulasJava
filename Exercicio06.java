package exercico;

import java.util.Scanner;

// 2) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2

public class Exercicio06 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número a base: ");
		
		int numero1 = sc.nextInt();
		
		System.out.println("Digite o número a altura: ");
		
		int numero2 = sc.nextInt();
		
		System.out.println("O resultado é: ");
		
		System.out.println(numero1 * numero2 / 2);
		
		sc.close();
	}
	
	
	
}
