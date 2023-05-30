package ro.ase.testing.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ro.ase.testing.mocks.FakePachet;
import ro.ase.testing.model.AgentieTurism;
import ro.ase.testing.model.IPachet;

public class TestingAgentieTurism {

	@Test
	void expectedPrice() {
		AgentieTurism agentie = new AgentieTurism();
		FakePachet pachet1 = new FakePachet();
		pachet1.setGetPretValue(100.0);
		FakePachet pachet2 = new FakePachet();
		pachet2.setGetPretValue(100.0);
		FakePachet pachet3 = new FakePachet();
		pachet3.setGetPretValue(100.0);
		agentie.adaugaPachet(pachet1);
		agentie.adaugaPachet(pachet2);
		agentie.adaugaPachet(pachet3);
		
		assertEquals(300, agentie.calculareSumaTotalaPachete());
	}

}
