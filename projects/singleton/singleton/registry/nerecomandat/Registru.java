package singleton.registry.nerecomandat;

import java.util.HashMap;
import java.util.Map;

public class Registru {
	
	private static Map<String, Firma> firme = new HashMap<>();
	
	public static Firma getFirma(String nume) {
		
		if(!firme.containsKey(nume)) {
			Firma firma = new Firma(nume, 0);
			firme.put(nume, firma);
		}
		
		return firme.get(nume);
		
	}

}
