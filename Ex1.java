package CodigoLimpo;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int fat =1, num;

		System.out.println("Informe o Fatorial: ");
		num = ler.nextInt();

		if (num<0) { // estrutura de decisão 
			System.out.println("Não existe fatorial de número negativo!");
			System.exit(0);
		}
			for (int i = 1; i <=num ; i++) {
				fat *= i;
			}
			System.out.println("O fatorial de " + num + " é " +fat);
		ler.close();
	}
}

