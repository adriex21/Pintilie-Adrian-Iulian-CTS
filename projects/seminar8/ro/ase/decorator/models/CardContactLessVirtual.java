package ro.ase.decorator.models;

public class CardContactLessVirtual extends AbstractDecorator {
	public CardContactLessVirtual(ICard card) {
		super(card);
	}

	@Override
	public void payContactLess(double sum) {
		System.out.println("S-a platit cu card contactless virtual. S-a debitat cu suma  "+sum);
		
	}
}
