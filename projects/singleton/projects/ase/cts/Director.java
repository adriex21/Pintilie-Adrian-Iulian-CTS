package projects.ase.cts;

public class Director {
	private String nume;
	private int varsta;
	private static Director director = null;
	
	
	private Director(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	
	
	@Override
	public String toString() {
		return "Director [nume=" + nume + ", varsta=" + varsta + "]";
	}


	public synchronized static Director getInstance(String nume) {
		if(director == null) {
			director = new Director(nume, 30);
		}
		return director;
	}
	
	
}
