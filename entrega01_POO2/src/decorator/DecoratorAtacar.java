package decorator;
/*import contexto.Personagem;

public abstract class DecoratorAtacar extends Personagem{
	private Personagem PAtaqueDecorado;
	
	public DecoratorAtacar(Personagem PAtaqueDecorado) {
		this.PAtaqueDecorado = PAtaqueDecorado;
	}
	
	public int atacar() {
		return PAtaqueDecorado.atacar() + super.atacar();
	}
}*/

import strategy.Atacar;

public abstract class DecoratorAtacar implements Atacar {
private Atacar ataqueDecorado;
	
	public DecoratorAtacar(Atacar PAtaqueDecorado) {
		this.ataqueDecorado = PAtaqueDecorado;
	}
	
	public int atacar() {
		return ataqueDecorado.atacar();
	}
}
