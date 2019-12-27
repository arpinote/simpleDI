package depinj.service;

public class Powerbank implements Powerable {

	@Override
	public String powerDrain() {
		return "Draw power from Powerbank";
	}

}
