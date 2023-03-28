package ro.acs.prototype.main;

import ro.acs.prototype.AbstractPrototype;
import ro.acs.prototype.Client;

public class Main {

	public static void main(String[] args )throws CloneNotSupportedException {
	
		AbstractPrototype clientPrototype = new Client("Andrei", "0732331314", "andrei@gmail.com");
		AbstractPrototype client2 = clientPrototype.createACopy();
		System.out.println(client2.toString());
		

	}

}
