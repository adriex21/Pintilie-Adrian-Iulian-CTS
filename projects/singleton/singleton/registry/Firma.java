package singleton.registry;

import java.util.HashMap;
import java.util.Map;

public class Firma {

	private String nume;
	private int cifraAfaceri;
	private int nrAngajati;
	
	private static Map<String, Firma> firme = new HashMap<>();

	private Firma(String nume, int cifraAfaceri, int nrAngajati) {
		super();
		this.nume = nume;
		this.cifraAfaceri = cifraAfaceri;
		this.nrAngajati = nrAngajati;
	}
	
	public void angajare() {
		this.nrAngajati++;
	}
	
	
	
	@Override
	public String toString() {
		return "Firma [nume=" + nume + ", cifraAfaceri=" + cifraAfaceri + ", nrAngajati=" + nrAngajati + "]";
	}

	public synchronized static Firma getFirma(String nume) {
		
		if(!firme.containsKey(nume)) {
			
			Firma firma = new Firma(nume, 0 , 0);
			firme.put(nume, firma);
		}
		
		return firme.get(nume);
	}
}
