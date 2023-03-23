package estado;

import contexto.Personagem;
import strategyacoes.*;

public class EstadoPerigo extends Estado {
	public EstadoPerigo(Personagem personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtacarFraco());
		this.getPersonagem().setCorrida(new CorrerDevagar());
	}
	
	@Override
	public void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(30);
	}

	@Override
	public void checaEstado() {
		if (this.getPersonagem().getVida() >= this.getLimiteSuperior()) {
			this.getPersonagem().setEstado(new EstadoNormal(getPersonagem()));
			this.getPersonagem().getEstado().checaEstado();
		}
		else if (this.getPersonagem().getVida() <= this.getLimiteInferior()) {
			this.getPersonagem().setEstado(new EstadoMorto(getPersonagem()));
		}

	}

}
