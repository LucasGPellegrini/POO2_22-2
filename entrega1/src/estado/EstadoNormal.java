package estado;
import contexto.Personagem_2e3;
import strategy.*;


public class EstadoNormal extends Estado {

	public EstadoNormal(Personagem_2e3 personagem) {
		super(personagem);
		this.getPersonagem().setAtaque(new AtacarMedio());
		this.getPersonagem().setCorrida(new CorrerMedio());
	}
	
	@Override
	public void setLimites() {
		this.setLimiteInferior(30);
		this.setLimiteSuperior(70);
	}

	@Override
	public void checaEstado() {
		if (this.getPersonagem().getVida() < this.getLimiteInferior()) {
			this.getPersonagem().setEstado(new EstadoPerigo(getPersonagem()));
			this.getPersonagem().getEstado().checaEstado();
		}
		else if (this.getPersonagem().getVida() > this.getLimiteSuperior()) {
			this.getPersonagem().setEstado(new EstadoForte(getPersonagem()));
		}

	}

}
