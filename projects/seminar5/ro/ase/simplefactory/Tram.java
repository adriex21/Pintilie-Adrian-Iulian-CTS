package ro.ase.simplefactory;

public class Tram implements ITransportVehicle {

	private int noSeats;
	
	protected Tram(int noSeats) {
		this.noSeats = noSeats;
	}
	
	@Override
	public void showInfo() {
		System.out.println("This tram has " + this.noSeats + " seats.");
	}

	@Override
	public void movingType() {
		System.out.println("This tram is moving by rails");
		
	}
}
