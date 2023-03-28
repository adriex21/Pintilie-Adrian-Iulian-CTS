package ro.acs.prototype;

public interface AbstractPrototype extends Cloneable{

	public AbstractPrototype createACopy() throws CloneNotSupportedException;
	
}
