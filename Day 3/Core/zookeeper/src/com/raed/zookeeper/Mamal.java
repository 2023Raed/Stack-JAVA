package com.raed.zookeeper;


	public class Mamal {
		 // member variable
		private int energyLevel;

		public Mamal() {
			this.energyLevel = 100;
		}
		public void displayEnergy() {
			System.out.printf("the energy level = %d \n" , getEnergyLevel());
		}
		
		public int getEnergyLevel() {
			return energyLevel;
		}

		public void setEnergyLevel(int energyLevel) {
			this.energyLevel = energyLevel;
		}
		

}
