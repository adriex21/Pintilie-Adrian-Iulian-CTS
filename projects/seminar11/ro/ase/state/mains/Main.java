package ro.ase.state.mains;

import ro.ase.state.models.Bus;
import ro.ase.state.models.IBusState;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("B123STB");
        bus.pleacaInService();
        bus.pleacaLaCapatDeLinie();
        bus.pleacaLaCapatDeLinie();
        bus.pleacaInCursa();
        bus.pleacaLaCapatDeLinie();
    }
}