package decorator;

import strategy.Atacar;

public class Fogo extends DecoratorAtacar {
	public Fogo(Atacar ataqueDecorado) {
		super(ataqueDecorado);
	}
	
	public int atacar() {
		System.out.println("Com poder de Fogo!");
		return super.atacar() + 15;
	}
}
