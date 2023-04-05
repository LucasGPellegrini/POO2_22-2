package decorator;

import strategy.Atacar;

public abstract class DecoratorAtacar implements Atacar {
	private Atacar ataqueDecorado;
	private int danoAdicional;
	
	public DecoratorAtacar(Atacar ataqueDecorado) {
		this.ataqueDecorado = ataqueDecorado;
	}
	
	public int atacar() {
		return ataqueDecorado.atacar() + this.danoAdicional;
	}
	
	public void setDanoAdicional(int valor) {
		this.danoAdicional = valor;
	}

}
