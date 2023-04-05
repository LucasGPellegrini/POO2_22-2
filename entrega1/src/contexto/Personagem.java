package contexto;

import strategy.Atacar;
import strategy.Correr;
import strategy.Pular;

public abstract class Personagem {
	private Atacar atk;
	private Correr run;
	private Pular  jmp;
	
	// Não haverá construtor, uma vez que o construtor 
	// de cada subclasse equivale à seu "preset" de ações.
	
	// Ações:
	public int atacar() {
		return this.atk.atacar();
	}
	
	public void correr() {
		this.run.correr();
	}
	
	public void pular() {
		this.jmp.pular();
	}
	
	// Setters:
	public void setAtaque(Atacar ataque) {
		this.atk = ataque;
	}
	
	
	public void setCorrida(Correr corrida) {
		this.run = corrida;
	}
	
	public void setPulo(Pular pulo) {
		this.jmp = pulo;
	}
	
	// Getters
	public Atacar getAtaque() {
		return this.atk;
	}
}
