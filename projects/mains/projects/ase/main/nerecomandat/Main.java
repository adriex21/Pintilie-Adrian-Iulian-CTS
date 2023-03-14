package projects.ase.main.nerecomandat;

import singleton.registry.nerecomandat.Firma;
import singleton.registry.nerecomandat.Registru;

public class Main {

	public static void main(String[] args) {
		
		Firma firma1 = Registru.getFirma("SC FIRMA");
		System.out.println(firma1);
	
	}

}
