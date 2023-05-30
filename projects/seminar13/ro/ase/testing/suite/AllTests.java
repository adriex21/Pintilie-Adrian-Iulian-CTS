package ro.ase.testing.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import ro.ase.testing.test.TestingAgentieTurism;
import ro.ase.testing.test.TestingPachetTuristic;
import ro.ase.testing.test.TestingPachetTuristicDiscount;

@Suite
@SelectClasses({TestingAgentieTurism.class, TestingPachetTuristic.class, TestingPachetTuristicDiscount.class})
public class AllTests {

}
