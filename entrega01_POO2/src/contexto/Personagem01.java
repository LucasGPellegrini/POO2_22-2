package contexto;
import strategy.*;

public class Personagem01 extends Personagem {
	public Personagem01() {
		setAtaque(new AtacarForte());
		setCorrida(new CorrerMedio());
		setPulo(new PularMedio());
	}
}
