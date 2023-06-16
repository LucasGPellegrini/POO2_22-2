package estado;

import contexto.*;
import strategy.*;

public class EstadoForte extends Estado {
	public EstadoForte(Personagem personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtacarForte());
		this.getPersonagem().setCorrida(new CorrerRapido());
	}
	
	@Override
	public void setLimites() {
		this.setLimiteInferior(70);
	}

	@Override
	public void checaEstado() {
		if (this.getPersonagem().getVida() <= this.getLimiteInferior()) {
			this.getPersonagem().setEstado(new EstadoNormal(getPersonagem()));
			this.getPersonagem().getEstado().checaEstado();
		}

	}

}
