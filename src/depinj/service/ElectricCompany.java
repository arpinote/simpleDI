package depinj.service;

public class ElectricCompany implements Powerable {

	@Override
	public String powerDrain() {
		return "Draw Power From Electric Company";
	}

}
