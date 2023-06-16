package decorator;

import strategy.Atacar;

public class Agua extends DecoratorAtacar {
	public Agua(Atacar ataqueDecorado) {
		super(ataqueDecorado);
		this.setDanoAdicional(10);
	}
}
