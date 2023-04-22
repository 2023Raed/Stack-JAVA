package com.raed.car;

public class Car {
//	Member variables
   private int gas;
//   Constructor
   public Car() {
	 this.gas=10;
}
//   Methods
   public void displayGas(int gas) {
	   System.out.printf("your fuel remaining is%d \n",gas);
	   
   }
public int getGas() {
	return gas;
}
public void setGas(int gas) {
	this.gas = gas;
}
   
}
