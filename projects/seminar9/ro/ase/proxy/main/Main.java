package ro.ase.proxy.main;

import ro.ase.proxy.models.CasaDeBilete;
import ro.ase.proxy.models.Client;
import ro.ase.proxy.models.ICasaDeBilete;
import ro.ase.proxy.models.Proxy;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(24, "Gigel");
        Client client2 = new Client(14, "Mercel");
        Client client3 = new Client(10, "Dorel");

        ICasaDeBilete casaDeBilete = new CasaDeBilete();
        casaDeBilete.vindeBilete(client);
        casaDeBilete.vindeBilete(client2);
        casaDeBilete.vindeBilete(client3);

        ICasaDeBilete casaDeBileteProxy = new Proxy(casaDeBilete);
        casaDeBileteProxy.vindeBilete(client);
        casaDeBileteProxy.vindeBilete(client2);
        casaDeBileteProxy.vindeBilete(client3);
    }
}