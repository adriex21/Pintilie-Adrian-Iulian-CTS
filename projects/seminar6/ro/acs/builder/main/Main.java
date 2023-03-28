package ro.acs.builder.main;

import ro.acs.builder.models.AbstractBuilder;
import ro.acs.builder.models.Builder;
import ro.acs.builder.models.BuilderV2;
import ro.acs.builder.models.Reservation;

public class Main {

	public static void main(String[] args) {
		AbstractBuilder builder = new Builder();
		builder.setAmbientalMusic(true).setMusicType("Jazz");
		
		Reservation reservation = builder.getReservation();
		reservation.toString();
		System.out.println(reservation);
		
		Reservation reservation1 = new Builder().setAmbientalMusic(true).setMusicType("Ceva").getReservation();
		System.out.println(reservation1.toString());
		
//		reservation.setMusicType("Rock");
//		System.out.println(reservation);
		
		
//		Reservation reservation2 = builder.getReservation();
		
		AbstractBuilder builder2 = new BuilderV2();
		Reservation reservation2 = builder2.setAmbientalMusic(true).setMusicType("Rock").getReservation();
		System.out.println(reservation2.toString());
		
		Reservation reservation3 = builder2.setMusicType("Metal").getReservation();
		System.out.println(reservation3.toString());
		
		
		

	}

}
