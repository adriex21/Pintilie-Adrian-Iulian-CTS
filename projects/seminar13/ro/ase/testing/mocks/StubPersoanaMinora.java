package ro.ase.testing.mocks;

import ro.ase.testing.model.IPersoana;

public class StubPersoanaMinora implements IPersoana{

	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "F";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 17;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}

}
