package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class SpaceKrakenApp {

	public void run() {
		Scanner kb = new Scanner(System.in);
		Kraken gertie = new Kraken("Gertrude", 50);
		Kirk kirk = new Kirk("Kirk", 10);
		Luke luke = new Luke("Luke", 10);
		Diana diana = new Diana("Diana", 10);

		while (gertie.getHealth() >= 0 && kirk.getHealth() >= 0) {
			gertie.krakAttack(kb);

			int gertiesDmg = gertie.krakDamage();

			kirk.kirkAttack();
			gertie.setHealth(kirk.kirkDamage());
			int gertiesNewHealth = (gertie.getHealth());

			System.out.println("Your new health is now " + gertiesNewHealth);
			System.out.println();
			kirk.setHealth(gertie.krakDamage());
			int kirksNewHealth = kirk.getHealth();

			if (kirksNewHealth >= 0) {
				System.out.println("Kirk's health is now " + kirksNewHealth);
				System.out.println();
			}
			if (kirksNewHealth < 0) {
				System.out.println("");
				gertie.krakWins();
			}

			System.out.println("You must now face the mighty Jedi Luke Skywalker!!");
			System.out.println();
		}
		

		while (gertie.getHealth() >= 0 && luke.getHealth() >= 0) {
			gertie.krakAttack(kb);

			int gertiesDmg = gertie.krakDamage();

			luke.lukeAttack();
			gertie.setHealth(luke.lukeDamage());
			int gertiesNewHealth = (gertie.getHealth());

			System.out.println("Gertie the Krakens new health is now " + gertiesNewHealth);
			luke.setHealth(gertie.krakDamage());
			int lukeNewHealth = luke.getHealth();

			if (lukeNewHealth >= 0) {
				System.out.println("Luke's health is now " + lukeNewHealth);
			}
			if (lukeNewHealth < 0) {
				System.out.println("");
				gertie.krakWins();
			}

			System.out.println("You are now goin to fight the amazing Wonder Woman Diana!! ");
		}
		
		
		while (gertie.getHealth() >= 0 && diana.getHealth() >= 0) {
			gertie.krakAttack(kb);

			int gertiesDmg = gertie.krakDamage();

			diana.dianaAttack();
			gertie.setHealth(diana.dianaDamage());
			int gertiesNewHealth = (gertie.getHealth());

			System.out.println("Your new health is now " + gertiesNewHealth);
			diana.setHealth(gertie.krakDamage());
			int dianaNewHealth = diana.getHealth();

			if (dianaNewHealth >= 0) {
				System.out.println("Diana's health is now " + dianaNewHealth);
			}
			if (dianaNewHealth < 0) {
				System.out.println("");
				gertie.krakWinsFinal();
				System.exit(0);
			}

		}
	}

}