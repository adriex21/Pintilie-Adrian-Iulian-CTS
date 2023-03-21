package ro.ase.factorymethod;

public class Troleu extends TransportVehicle{

	protected Troleu(int noSeats) {
		super(noSeats);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showInfo() {
		System.out.println("This trolley " +super.toString());
		
	}

	@Override
	public void moveType() {
		System.out.println("This trolley is moving using electricty");
		
	}

}
