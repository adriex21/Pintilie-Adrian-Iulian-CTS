package ro.ase.testing.tests;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ro.ase.testing.model.PachetTuristic;

import ro.ase.testing.model.IPersoana;
import ro.ase.testing.mocks.StubPersoanaMinora;
import ro.ase.testing.mocks.StubPerson;

class TestingPachetTuristic {

	@Test
	void testPoaterezerva() {
		IPersoana persoana = new StubPerson();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "destinatie", 20.25 );
		assertTrue(pachetTuristic.poateRezerva());
		
	}
	
	@Test
	void testNuPoateRezerva() {
		IPersoana persoana = new StubPersoanaMinora();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "destinatie", 20.25 );
		assertFalse(pachetTuristic.poateRezerva());
	}
	
	@Test
	
	public void testDemonstrativ() {
		assertEq
	}

}
