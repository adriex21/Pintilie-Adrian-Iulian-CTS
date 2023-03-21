package ro.ase.factorymethod;

public class Autobuz extends TransportVehicle {

	protected Autobuz(int noSeats) {
		super(noSeats);
	}
	
	
	@Override
	public void showInfo() {
		System.out.println("This bus " + super.toString());
		
	}

	@Override
	public void moveType() {
		System.out.println("This bus is moving using wheels");
		
	}

}

	
