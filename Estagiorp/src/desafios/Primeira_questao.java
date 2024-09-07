package desafios;

import java.util.Scanner;

public class Primeira_questao {
	
	private static void fibonacci(int numero) {
		int a = 0;
		int b = 1;
		int aux;
		
		do {
			aux = b;
			b = a + b;
			a = aux;
		}while(aux < numero);
		
		if(aux == numero) {
			System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci!");
		}else {
			System.out.println("O numero " + numero + " nao pertence a sequencia de Fibonacci!");
		}
	}

	public static void main(String[] args) {
		int numero = 0;
		Scanner x = new Scanner(System.in);
		
		System.out.println("Digite um numero, para verificar se ele pertence a sequencia de Fibonacci: ");
		numero = x.nextInt();
		
		fibonacci(numero);
		
		x.close();
	}

}
