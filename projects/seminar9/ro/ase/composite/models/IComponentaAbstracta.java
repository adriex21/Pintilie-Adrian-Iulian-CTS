package ro.ase.composite.models;

public interface IComponentaAbstracta {
	public void adaugaNod(IComponentaAbstracta nod) throws Exception;
	public void StergeNod(IComponentaAbstracta nod) throws Exception;
	public IComponentaAbstracta getNodCopil(int index) throws Exception;
	public void afiseazaComponenta(String indentare);
}
