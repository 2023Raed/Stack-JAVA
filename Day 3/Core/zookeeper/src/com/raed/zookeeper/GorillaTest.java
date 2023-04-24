package com.raed.zookeeper;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla gorilla1 = new Gorilla();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		System.out.println("After throw somyhing");
		gorilla1.displayEnergy();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		System.out.println("After eat 2 bananas");
		gorilla1.displayEnergy();
		gorilla1.climb();
		gorilla1.climb();
		gorilla1.climb();
		System.out.println("After 3 climbs");
		gorilla1.displayEnergy();
	}
}
