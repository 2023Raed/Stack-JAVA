package com.raed.car;

   public class Driver extends Car {
           public void drive() {
           setGas(getGas()-1);
           }
           public void usingBoosters() {
        	setGas(getGas()-3);   
           } 
           public void refueling() {
        	setGas(getGas()+2);
}
           public void driveDisplay() {
        	   System.out.printf("You drive the car \n Gas remaining: %d/10 \n",getGas());
           }
   }
