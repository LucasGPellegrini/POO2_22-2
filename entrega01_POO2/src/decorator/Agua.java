package decorator;

import strategy.Atacar;

public class Agua extends DecoratorAtacar {
	public Agua(Atacar ataqueDecorado) {
		super(ataqueDecorado);
	}
	
	public int atacar() {
		System.out.println("Com poder de Agua!");
		return super.atacar() + 10;
	}
}
