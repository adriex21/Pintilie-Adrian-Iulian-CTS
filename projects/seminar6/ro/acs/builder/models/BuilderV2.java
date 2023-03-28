package ro.acs.builder.models;

public class BuilderV2 implements AbstractBuilder {
	
	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;

	Reservation reservation;

	@Override
	public Reservation getReservation() {
		return new Reservation(isWindowPosition, isErgoChairs,isDecoratedTable,isAmbientalMusic, musicType);
	
	}
	
	public BuilderV2() {
		isWindowPosition = false;
		isErgoChairs = false;
		isDecoratedTable = false;
		isAmbientalMusic = false;
		musicType = null;
	}
	
	public AbstractBuilder setIsWindowPosition(Boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
		return this;
	}
	
	public AbstractBuilder setErgoChairs(boolean isErgoChairs) {
		this.isErgoChairs = isErgoChairs;
		return this;
		
	}


	public AbstractBuilder setDecoratedTable(boolean isDecoratedTable) {
		this.isDecoratedTable = isDecoratedTable;
		return this;
		
	}


	public AbstractBuilder setAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
		return this;
	}


	public AbstractBuilder setMusicType(String musicType) {
		this.musicType= musicType;
		return this;
	}
}
