package ro.ase.testare.teste;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import ro.ase.testare.clase.NotBornedYet;
import ro.ase.testare.clase.Persoana;

public class PersoanaTest {

	@Test
	public void testGetVarsta() {
		Persoana persoana = new Persoana("Mihai", "60110234532345");
		assertEquals(21, persoana.getVarsta());
	}
	@Test
	public void testgetVarstaError() {
		Persoana persoana = new Persoana("Gigel", "6230524561327");
		assertThrows(NotBornedYet.class, new Executable() {

			@Override
			public void execute() throws Throwable {
				persoana.getVarsta();
				
			}
			
		});
	}

}
