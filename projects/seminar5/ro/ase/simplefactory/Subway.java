package ro.ase.simplefactory;

public class Subway implements ITransportVehicle {
	
	private int noSeats;
	
	protected Subway(int noSeats) {
		this.noSeats = noSeats;
		
	}

	@Override
	public void showInfo() {
		System.out.println("Subway has " + this.noSeats + " seats.");
		
	}

	@Override
	public void movingType() {
		System.out.println("The subway is moving underground");
		
		
	}
	
	

}
