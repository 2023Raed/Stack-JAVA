package com.raed.zookeeper;

public class Bat{
	private int energyLevel;
	public Bat() {
		this.energyLevel = 300;
	}
	public void displayEnergy() {
		System.out.printf("the energy level = %d \n" , getEnergyLevel());
	}
	public void fly() {
		System.out.println("Bat is taking off");
		setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("so- well, never mind");
		setEnergyLevel(getEnergyLevel() +25);
	}
	public void attackTown() {
		System.out.println("town on fire");
		setEnergyLevel(getEnergyLevel() -100);
	}
	
	
	
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	


	
	

}

