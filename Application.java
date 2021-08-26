package main;

import kitchen.*;

public class Application {

	public static void main(String[] args) {
		
		//Part 1
		Cup cupA = new Cup ("Water", 300);
		Cup cupB = new Cup ("Milk", 500);
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
		System.out.println("cupA: Liquide Name: " + cupA.getLiquidName()+ ", Liquide Volume: " + cupA.getLiquidVolume());
		System.out.println("cupB: Liquide Name: " + cupB.getLiquidName()+ ", Liquide Volume: " + cupB.getLiquidVolume());
		
		//Part 2
		SmallCup cup1 = new SmallCup ("Tea", 200);
		System.out.println("cup1: " + cup1.getLiquidName() + ", " + cup1.getLiquidVolume());
		
		BigCup cup2 = new BigCup ("Water", 200);
		cup2.setLiquidVolume(cupB.getLiquidVolume() + cup2.getLiquidVolume());
		System.out.println("cup2: " + cup2.getLiquidName() + ", " + cup2.getLiquidVolume());
	}

}
