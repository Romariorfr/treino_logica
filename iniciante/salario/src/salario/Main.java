package salario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("US"));
		
		Scanner sc = new Scanner(System.in);
		
		// variaveis
		Integer funcionario, horas;
		Double valor, salario;

		// entrada
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();

		salario = valor * horas;

		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);

	}

}
