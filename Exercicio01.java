/*comentario inline
 * 
 */
package exercico;

import java.util.Scanner;

/**
 * @author Gabriel
 *
 */

/**Comentario Miltilinha**/

/** 1. Solicite um valor do teclado e exiba o sucessor**/

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número desejado ");
		
		int numero = sc.nextInt();
		int soma = numero + 1;
		
		
		System.out.println( soma );
		
		sc.close();
	}
}


