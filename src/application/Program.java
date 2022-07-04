package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Entendi a referência */

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nameA = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeA = sc.nextInt();
		System.out.print("Ataque: ");
		int attackA = sc.nextInt();
		System.out.print("Armadura: ");
		int armorA = sc.nextInt();

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nameB = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeB = sc.nextInt();
		System.out.print("Ataque: ");
		int attackB = sc.nextInt();
		System.out.print("Armadura: ");
		int armorB = sc.nextInt();

		Champion champA = new Champion(nameA, lifeA, attackA, armorA);
		Champion champB = new Champion(nameB, lifeB, attackB, armorB);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int number = sc.nextInt();
		int i = 1;
		do {
			champA.takeDamege(champB);
			champB.takeDamege(champA);
			System.out.println();
			System.out.println("Resultado do turno " + i + ": ");
			System.out.println(champA.status());
			System.out.println(champB.status());
			if (champA.getLife() == 0 || champB.getLife() == 0) {
				i = number + 1;
			} else {
				i++;
			}
		} while (i <= number);

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}

}
