package main;

import kitchen.*;

public class Application {

	public static void main(String[] args) {
		Cup cupA = new Cup ("Water", 300);
		Cup cupB = new Cup ("Milk", 500);
		cupA.setLiquidVolume(cupA.getLiquidVolume()-50);
		cupB.setLiquidVolume(cupB.getLiquidVolume()+50);
		System.out.println("cupA: Liquide Name: " + cupA.getLiquidName()+ ", Liquide Volume: " + cupA.getLiquidVolume());
		System.out.println("cupB: Liquide Name: " + cupB.getLiquidName()+ ", Liquide Volume: " + cupB.getLiquidVolume());
	}

}
