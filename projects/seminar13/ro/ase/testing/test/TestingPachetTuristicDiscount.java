package ro.ase.testing.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ro.ase.testing.mocks.FakePerson;
import ro.ase.testing.model.PachetTuristic;

public class TestingPachetTuristicDiscount {

	@Test
	void shouldApplyDiscountForSenior() {
		FakePerson fakePerson = new FakePerson();
		fakePerson.setGetVarstaValue(66);
		fakePerson.setGetSexValue("M");
		PachetTuristic pachet = new PachetTuristic(fakePerson, "Grecia", 1000.0);
		pachet.aplicaDiscountVarstnici(15);
		assertEquals(850, pachet.getPret());
	}
	
	@Tag("Tag2")
	@Test 
	void shouldNotApplyDiscount() {
		FakePerson fakePerson = new FakePerson();
		fakePerson.setGetVarstaValue(56);
		fakePerson.setGetSexValue("M");
		PachetTuristic pachet = new PachetTuristic(fakePerson, "Grecia", 1000.0);
		pachet.aplicaDiscountVarstnici(15);
		assertEquals(1000.0, pachet.getPret());
	}

}
