package ro.ase.testing.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import ro.ase.testing.mocks.StubPersoanaMinora;
import ro.ase.testing.mocks.StubPerson;
import ro.ase.testing.model.IPersoana;
import ro.ase.testing.model.PachetTuristic;

public class TestingPachetTuristic {

	@Tag("tag1")
	@Test
	void testPoaterezerva() {
		IPersoana persoana = new StubPerson();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "destinatie", 20.25 );
		assertTrue(pachetTuristic.poateRezerva());
		
	}
	
	@Tag("tag2")
	@Test
	void testNuPoateRezerva() {
		IPersoana persoana = new StubPersoanaMinora();
		PachetTuristic pachetTuristic = new PachetTuristic(persoana, "destinatie", 20.25 );
		assertFalse(pachetTuristic.poateRezerva());
	}
	
	

}
