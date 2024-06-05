package CodigoLimpo;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		int senhaTentativa, senhaMestre;
		double n1, n2, soma;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Cadastre uma senha(apenas numeros): ");
	senhaMestre = ler.nextInt();
	
	System.out.println("Digite um número: ");
	n1 = ler.nextDouble();
	
	System.out.println("Digite outro número: ");
	n2 = ler.nextDouble();
	
	soma = n1+n2;
	
	System.out.println("Digite a sua senha para desbloquear a soma: ");
	senhaTentativa = ler.nextInt();
	
	if (senhaTentativa==senhaMestre) {
	System.out.println("A soma é : " +soma );
	}
	
	else {
		System.out.println("Erro!Senha errada!");
		ler.close();
	}
	}
	

}
