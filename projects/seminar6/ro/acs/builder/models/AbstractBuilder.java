package ro.acs.builder.models;

public interface AbstractBuilder {

	public abstract Reservation getReservation();
	
	abstract AbstractBuilder setIsWindowPosition(Boolean isWindowPosition);
	
	abstract AbstractBuilder setErgoChairs(boolean isErgoChairs);

	abstract AbstractBuilder setDecoratedTable(boolean isDecoratedTable);

	abstract AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic);

	abstract AbstractBuilder setMusicType(String musicType);
}
