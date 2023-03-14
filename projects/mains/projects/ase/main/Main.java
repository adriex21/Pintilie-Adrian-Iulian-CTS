package projects.ase.main;

import projects.ase.cts.Director;
import projects.ase.cts.Papa;

public class Main {

	public static void main(String[] args) {
		
		Papa papa1 = Papa.getInstance();
		System.out.println(papa1);
		Papa papa2= Papa.getInstance();
		System.out.println(papa2);
		
		
		Director director1 = Director.getInstance("Victor");
		Director director2 = Director.getInstance("Stefan");
		System.out.println(director1.toString());
		System.out.println(director2.toString());
	}

}
