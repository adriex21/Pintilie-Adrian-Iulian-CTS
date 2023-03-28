package ro.acs.builder.models;

public class Reservation {
	private boolean isWindowPosition;
	private boolean isErgoChairs;
	private boolean isDecoratedTable;
	private boolean isAmbientalMusic;
	private String musicType;
	
	
	public Reservation(boolean isWindowPosition, boolean isErgoChairs, boolean isDecoratedTable,
			boolean isAmbientalMusic, String musicType) {
		super();
		this.isWindowPosition = isWindowPosition;
		this.isErgoChairs = isErgoChairs;
		this.isDecoratedTable = isDecoratedTable;
		this.isAmbientalMusic = isAmbientalMusic;
		this.musicType = musicType;
	}


	protected void setWindowPosition(boolean isWindowPosition) {
		this.isWindowPosition = isWindowPosition;
	}


	protected void setErgoChairs(boolean isErgoChairs) {
		this.isErgoChairs = isErgoChairs;
	}


	protected void setDecoratedTable(boolean isDecoratedTable) {
		this.isDecoratedTable = isDecoratedTable;
	}


	protected void setAmbientalMusic(boolean isAmbientalMusic) {
		this.isAmbientalMusic = isAmbientalMusic;
	}


	protected void setMusicType(String musicType) {
		this.musicType = musicType;
	}


	@Override
	public String toString() {
		return "Reservation [isWindowPosition=" + isWindowPosition + ", isErgoChairs=" + isErgoChairs
				+ ", isDecoratedTable=" + isDecoratedTable + ", isAmbientalMusic=" + isAmbientalMusic + ", musicType="
				+ musicType + "]";
	}
	
	
	
	
	
	
	

}
