package ro.ase.factorymethod;

public abstract class TransportVehicle {
	
	private int noSeats;
	
	protected TransportVehicle(int noSeats) {
		this.noSeats = noSeats;
	}
	
	public abstract void showInfo();
	public abstract void moveType();

	@Override
	public String toString() {
		return "has " + this.noSeats + " seats";
	}
	
	

}
