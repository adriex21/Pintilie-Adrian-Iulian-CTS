package ro.ase.testing.mocks;

import ro.ase.testing.model.IPachet;
import ro.ase.testing.model.IPersoana;

public class FakePachet implements IPachet {
	
	private double getPretValue;
	
	public void setGetPretValue(double getPretValue) {
		this.getPretValue = getPretValue;
	}

	@Override
	public boolean poateRezerva() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IPersoana getClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClient(IPersoana client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDestinatie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDestinatie(String destinatie) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double getPret() {
		return getPretValue;
	}

	@Override
	public void setPret(Double pret) {
		// TODO Auto-generated method stub
		
	}

}
