package desafios;

import java.util.Scanner;

public class Segunda_questao {
	
	private static int busca(String frase) {
		int contador = 0;
		for(int i = 0; i < frase.length(); i++) {
			char f = frase.charAt(i);
			if(f == 'a' || f == 'A') {
				contador++;
			}
		}
		
		System.out.println("A letra a/A, aparece " + contador + " vezes nessa frase.");
		return contador;
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = x.nextLine();
		
		busca(frase);
		
		x.close();
	}

}
