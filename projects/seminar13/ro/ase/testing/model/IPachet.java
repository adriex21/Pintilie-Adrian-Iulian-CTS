package ro.ase.testing.model;

public interface IPachet {
	
	public boolean poateRezerva();
	public void aplicaDiscountVarstnici(int procent);
	public IPersoana getClient();
	public void setClient(IPersoana client);
	public String getDestinatie();
	public void setDestinatie(String destinatie);
	public Double getPret();
	public void setPret(Double pret);
	

}
