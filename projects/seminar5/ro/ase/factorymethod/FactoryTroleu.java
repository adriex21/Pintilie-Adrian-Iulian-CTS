package ro.ase.factorymethod;

public class FactoryTroleu implements Factory {

	@Override
	public TransportVehicle createObject(int noSeats) {
		// TODO Auto-generated method stub
		return new Troleu(noSeats);
	}
	

}
