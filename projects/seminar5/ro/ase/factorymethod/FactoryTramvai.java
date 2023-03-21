package ro.ase.factorymethod;

public class FactoryTramvai implements Factory{

	@Override
	public TransportVehicle createObject(int noSeats) {
		// TODO Auto-generated method stub
		return new Tramvai(noSeats);
	}
	
	

}
