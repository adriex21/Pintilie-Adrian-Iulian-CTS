package ro.ase.simplefactory;

public class Trolley implements ITransportVehicle {
	
	private int noSeats;
	
	protected Trolley(int noSeats) {
		this.noSeats = noSeats;
	}

	
	@Override
	public void showInfo() {
		System.out.println("This Trolley has " +this.noSeats+ " seats.");
		
	}


	@Override
	public void movingType() {
		System.out.println("This trolley is electric");
		
	}

}
