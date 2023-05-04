package contexto;
import strategy.*;

public class Personagem03 extends Personagem {
	public Personagem03() {
                super();
		setAtaque(new AtacarForte());
		setCorrida(new CorrerRapido());
		setPulo(new PularBaixo());
	}
}
