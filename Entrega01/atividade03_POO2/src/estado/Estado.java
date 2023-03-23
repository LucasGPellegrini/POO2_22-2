package estado;

import contexto.Personagem;
// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_
// Implementar transições indiretas.
// -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_

public abstract class Estado {
	private Personagem personagem;
	private int limite_superior;
	private int limite_inferior;
	
	public Estado(Personagem personagem) {
		this.personagem = personagem;
		setLimites();
	}
	
	public Personagem getPersonagem() {
		return this.personagem;
	}
	
	public void setLimiteSuperior(int limite) {
		this.limite_superior = limite;
	}
	public int getLimiteSuperior() {
		return this.limite_superior;
	}
	
	public void setLimiteInferior(int limite) {
		this.limite_inferior = limite;
	}
	public int getLimiteInferior() {
		return this.limite_inferior;
	}
	
	
	public abstract void setLimites();
	public abstract void checaEstado();
	
}
