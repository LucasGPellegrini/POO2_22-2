package decorator;

import strategy.Atacar;

public class Ar extends DecoratorAtacar {
	public Ar(Atacar ataqueDecorado) {
		super(ataqueDecorado);
	}
	
	public int atacar() {
		System.out.println("Com poder de Ar!");
		return super.atacar() + 8;
	}
}
