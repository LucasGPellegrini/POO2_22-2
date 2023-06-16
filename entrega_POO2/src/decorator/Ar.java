package decorator;

import strategy.Atacar;

public class Ar extends DecoratorAtacar {
	public Ar(Atacar ataqueDecorado) {
		super(ataqueDecorado);
		this.setDanoAdicional(8);
	}
}
