package ro.ase.factorymethod.main;

import java.util.ArrayList;
import java.util.List;

import ro.ase.factorymethod.Factory;
import ro.ase.factorymethod.FactoryAutobuz;
import ro.ase.factorymethod.FactoryTroleu;
import ro.ase.factorymethod.TransportVehicle;

public class Main {

	public static void main(String[] args) {
		
		Factory fAutobuze = new FactoryAutobuz();
		
		Factory fTrolebuze = new FactoryTroleu();
		
		List<TransportVehicle> mijloaceTransport = new ArrayList<>();
		mijloaceTransport.add(fAutobuze.createObject(10));
		mijloaceTransport.add(fAutobuze.createObject(15));
		mijloaceTransport.add(fTrolebuze.createObject(50));
		
		for(TransportVehicle t:mijloaceTransport) {
			t.showInfo();
			t.moveType();
		}
		

	}

}
