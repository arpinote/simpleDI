package depinj.injector;

import depinj.service.Powerable;
import depinj.service.ElectricCompany;

public class ElectricCompanyInjector implements Injector {

	@Override
	public Powerable getPower() {
		return new ElectricCompany();
	}

}
