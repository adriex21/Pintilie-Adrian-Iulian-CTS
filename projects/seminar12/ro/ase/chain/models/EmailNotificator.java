package ro.ase.chain.models;

public class EmailNotificator extends INotificare {

	public EmailNotificator(INotificare nextNotif) {
		super(nextNotif);
	}

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
		if(client.getEmail()!=null) {
			System.out.println("Clientul " + client.getNume()+ " ai primit un mail cu mesajul "
					+ mesaj);
		}
		else if(super.getNextNotif()!=null) {
			super.getNextNotif().trimiteNotificare(client, mesaj);
		}
		else {
			System.out.println("Problema nu a putut fi rezolvata!");
		}
		
	}

}
