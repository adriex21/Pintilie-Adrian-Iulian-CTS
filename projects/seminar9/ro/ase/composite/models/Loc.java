package ro.ase.composite.models;

public class Loc implements IComponentaAbstracta{
	private int rand;
	private int numar;
	
	public Loc(int rand, int numar) {
		this.rand = rand;
		this.numar=  numar;
	}
	@Override
	public void adaugaNod(IComponentaAbstracta nod) throws Exception {
		throw new Exception("Not yet implemented");	
	}

	@Override
	public void StergeNod(IComponentaAbstracta nod) throws Exception {
		throw new Exception("Not yet implemented");	
	}

	@Override
	public IComponentaAbstracta getNodCopil(int index) throws Exception {
		throw new Exception("Not yet implemented");	
	}

	@Override
	public void afiseazaComponenta(String indentare) {
		System.out.println(indentare+"LOCUL: "+this.numar+" ,RANDUL: "+this.rand);
		
	}
	
}
