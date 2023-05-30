package ro.ase.testing.mocks;

import ro.ase.testing.model.IPersoana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StubPerson implements IPersoana{


	@Override
	public String getSex() {
		// TODO Auto-generated method stub
		return "M";
	}

	@Override
	public int getVarsta() {
		// TODO Auto-generated method stub
		return 18;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return true;
	}

}
