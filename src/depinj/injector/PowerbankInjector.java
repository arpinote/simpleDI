package depinj.injector;

import depinj.service.Powerable;
import depinj.service.Powerbank;

public class PowerbankInjector implements Injector {

	@Override
	public Powerable getPower() {
		return new Powerbank();
	}

}
