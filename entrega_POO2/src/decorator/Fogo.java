package decorator;

import strategy.Atacar;

public class Fogo extends DecoratorAtacar {
	public Fogo(Atacar ataqueDecorado) {
		super(ataqueDecorado);
		this.setDanoAdicional(15);
	}
}
