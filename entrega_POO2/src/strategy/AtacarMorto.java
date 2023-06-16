package strategy;

public class AtacarMorto implements Atacar {

	@Override
	public int atacar() {
		System.out.println("Fim de Jogo!");
		return 0;
	}

}
