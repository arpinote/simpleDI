package depinj.injector.factory;

import depinj.service.*;

public class LaptopInjectorFactory {
	public Powerable getPower(String powerType) {
		if(powerType==null) return null;
		
		if(powerType.equalsIgnoreCase("ELECTRICCOMPANY")) {
			return new ElectricCompany();
		}
		
		if(powerType.equalsIgnoreCase("GENERATOR")) {
			return new Generator();
		}
		
		if(powerType.equalsIgnoreCase("POWERBANK")) {
			return new Powerbank();
		}
		
		return null;
	}
}
