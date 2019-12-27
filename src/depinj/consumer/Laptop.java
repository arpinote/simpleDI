package depinj.consumer;

import depinj.service.Powerable;

public class Laptop {
	Powerable power;
	String brand;
	
	public Laptop(String brand, Powerable power) {
		this.power = power;
		this.brand = brand;
	}
	
	public void turnOn() {
		String powerSource = power.powerDrain();
		System.out.println("Turn on the " + this.brand + " laptop: " + powerSource);
	}
}
