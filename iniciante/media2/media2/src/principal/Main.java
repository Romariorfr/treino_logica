package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// variaveis
		Double a, b, c, media;
		final int P1 = 2;
		final int P2 = 3;
		final int P3 = 5;

		// lendo valores
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		// media ponderada
		media = ((a * P1) + (b * P2) + (c * P3)) / (P1 + P2 + P3);

		// resposta
		System.out.printf("MEDIA = %.1f \n", media);

	}

}
