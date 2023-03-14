package singleton.mains.MainRegistry;

import singleton.registry.Firma;

public class MainRegistry {

	public static void main(String[] args) {
	
		Firma firma1 = Firma.getFirma("SC CEVA SRL");
		Firma firma2= Firma.getFirma("SC ALTCEVA SRL");
		Firma firma3= Firma.getFirma("SC CEVA SRL");
		
		firma1.angajare();
		firma2.angajare();
		firma3.angajare();
		
		System.out.println(firma1);
		System.out.println(firma2);
		System.out.println(firma3);
	}

}
