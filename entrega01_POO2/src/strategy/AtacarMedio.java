package strategy;

public class AtacarMedio implements Atacar {

	@Override
	public int atacar() {
		System.out.println("Ataque Medio!");
		return 15;
	}

}
