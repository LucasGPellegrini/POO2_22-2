package strategy;

public class AtacarForte implements Atacar {

	@Override
	public int atacar() {
		System.out.println("Ataque Forte!");
		return 30;
	}
}
