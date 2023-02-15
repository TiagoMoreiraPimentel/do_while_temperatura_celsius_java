package do_while_temperatura_celsius;

import java.util.Locale;
import java.util.Scanner;

public class do_while_temperatura_celsius {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		
		do {
			System.out.println("Digite a temperatura em Celsius:");
			double c = sc.nextDouble();
			double F = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			resposta = sc.next().charAt(0);
		} while(resposta != 'n');
		
		sc.close();

	}

}
