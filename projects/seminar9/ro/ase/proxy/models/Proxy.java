package ro.ase.proxy.models;

public class Proxy implements ICasaDeBilete{
	ICasaDeBilete casaDeBilete;
	
	public Proxy(ICasaDeBilete casaDeBilete) {
		this.casaDeBilete = casaDeBilete;
	}

	@Override
	public void vindeBilete(Client client) {
		if(client.getVarsta()>14) {
			casaDeBilete.vindeBilete(client);
		} else {
			System.out.println("Clientul "+client+ " e prea tanar.");
		}
		
	}

}
