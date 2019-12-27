package depinj.injector;

import depinj.service.Generator;
import depinj.service.Powerable;

public class GeneratorInjector implements Injector {

	@Override
	public Powerable getPower() {
		return new Generator();
	}
	
}
