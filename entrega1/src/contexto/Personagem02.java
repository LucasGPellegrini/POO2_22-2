package contexto;
import strategy.*;

public class Personagem02 extends Personagem {
	public Personagem02() {
		setAtaque(new AtacarMedio());
		setCorrida(new CorrerRapido());
		setPulo(new PularAlto());
	}
}
