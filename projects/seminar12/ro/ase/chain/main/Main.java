package ro.ase.chain.main;

import ro.ase.chain.models.Client;
import ro.ase.chain.models.EmailNotificator;
import ro.ase.chain.models.INotificare;
import ro.ase.chain.models.Manager;
import ro.ase.chain.models.SmsNotificator;

public class Main {

	public static void main(String[] args) {
		
		INotificare sms = new SmsNotificator(null); 
		INotificare email = new EmailNotificator(null);
		INotificare manager = new Manager(null);
		
		sms.setNextNotif(email);
		email.setNextNotif(manager);
		
		Client client1= new Client("Mihai", null, "mihai@gmail.com");
		Client client2 = new Client("George", "07631314343", "george@email.com");
		Client client3 = new Client("Alex", "86565652", null);
		Client client4 = new Client("Ahmed", null, null);
		
		sms.trimiteNotificare(client1, "mesaj");
		sms.trimiteNotificare(client3, "alt mesaj");
		sms.trimiteNotificare(client2, "mesaj");
		sms.trimiteNotificare(client4, "yey");
		
		

	}

}
