package ro.ase.factorymethod;

public class Tramvai extends TransportVehicle {

	protected Tramvai(int noSeats) {
		super(noSeats);
	}

	@Override
	public void showInfo() {
		System.out.println("This tram " + super.toString());
		
	}

	@Override
	public void moveType() {
		System.out.println("This tram is moving using rails");
		
	}
	
	

}
