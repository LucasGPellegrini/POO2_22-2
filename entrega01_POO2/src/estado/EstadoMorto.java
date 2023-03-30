package estado;

import contexto.Personagem_2e3;
import strategy.*;

public class EstadoMorto extends Estado{
	public EstadoMorto(Personagem_2e3 personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtacarMorto());
		this.getPersonagem().setCorrida(new CorrerMorto());
	}
	
	@Override
	public void setLimites() {
		this.setLimiteSuperior(0);
	}

	@Override
	public void checaEstado() {
		/*if (this.getPersonagem().getVida() > this.getLimiteSuperior()) {
			this.getPersonagem().setEstado(new EstadoPerigo(getPersonagem()));
			this.getPersonagem().getEstado().checaEstado();s
		}*/
		System.out.println("Fim de Jogo!");
	}

}
