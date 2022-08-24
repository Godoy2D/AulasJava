package exercico;

import java.util.Scanner;

// 4) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2

public class Exercicio08 {

	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a diagnal maior: ");
		int diagonalmaior = sc.nextInt();
		
		System.out.println("Digite a diagnal menor: ");
		int diagonalmenor = sc.nextInt();
		
		System.out.println(diagonalmaior * diagonalmenor / 2);
		System.out.println("A area do losangulo é: ");
		sc.close();
	}
	
}
