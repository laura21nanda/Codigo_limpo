package CodigoLimpo;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		//Variáveis 
		double a ;
		//Instanciar classe Scanner 
		Scanner ler = new Scanner (System.in);

		//Entradad de dados 
		System.out.println("Informe um valor ");
		a = ler.nextDouble();

		if (a % 5 ==0) {
			System.out.println("O número " + a + " é multiplo de 5");
		}
		else { 
			System.out.println("O númerop " + a + " não é multiplo de 5");
		}
		ler.close();
	}

}
