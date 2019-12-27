package depinj;

import depinj.consumer.Laptop;
import depinj.injector.*;
import depinj.injector.factory.LaptopInjectorFactory;

public class Main {
	public static void main(String[] args) {
		LaptopInjectorFactory factory = new LaptopInjectorFactory();
		Laptop lenovo = new Laptop("Lenovo", factory.getPower("ELECTRICCOMPANY"));
		lenovo.turnOn();
		
		Injector injector = new GeneratorInjector();
		Laptop asus = new Laptop("Asus", injector.getPower());
		asus.turnOn();
		
	}
}
