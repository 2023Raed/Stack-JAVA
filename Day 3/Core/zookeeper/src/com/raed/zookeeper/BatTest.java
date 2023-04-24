package com.raed.zookeeper;

public class BatTest {
	public static void main(String[] args) {
		Bat bat1 = new Bat();
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		System.out.println("After 3 attack Towns");
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.eatHumans();
		System.out.println("After eat 2 Humans");
		bat1.displayEnergy();
		bat1.fly();
		bat1.fly();
		System.out.println("After 2 flys");
		bat1.displayEnergy();

	}
}
