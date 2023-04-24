package com.raed.zookeeper;

public class Gorilla extends Mamal {
	public void throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("gorilla has thrown something, as well as decrease the energy level by 5");
	}
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10 );
		System.out.println("the gorilla increase its energy by 10");
	}
	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10 );
		System.out.println("the gorilla has climbed a tree and decrease its energy by 10");
	}
}


