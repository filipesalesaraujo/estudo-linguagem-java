//Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
//nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo

import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new  Scanner(System.in);
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa:");
		System.out.println("Nome:");
		nome1 = sc.nextLine();
		System.out.println("Idade:");
		idade1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa:");
		System.out.println("Nome:");
		sc.nextLine();
		nome2 = sc.nextLine();
		System.out.println("Idade:");
		idade2 = sc.nextInt();
		
		media = (double)(idade1 + idade2) / 2;
		System.out.println("A idade media de " + nome1 + " e " + nome2 + " e de " + String.format("%.1f", media) + " anos");
		
		sc.close();

	}

}
