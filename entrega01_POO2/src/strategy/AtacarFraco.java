package strategy;

public class AtacarFraco implements Atacar {

	@Override
	public int atacar() {
		System.out.println("Ataque Fraco!");
		return 10;
	}

}
