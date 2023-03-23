package contexto;

import estado.*;
import strategyacoes.*;

public class Personagem {
	private Atacar atk;
	private Correr run;
	private int vida;
	private Estado estado;
	
	// Construtor
	public Personagem() {
		this.vida = 70;
		this.estado = new EstadoNormal(this);
		
	}
	
	// Ações:
	public void atacar() {
		this.atk.atacar();
	}
	
	public void correr() {
		this.run.correr();
	}
	
	
	// Setters:
	public void setAtaque(Atacar ataque) {
		this.atk = ataque;
	}
	
	public void setCorrida(Correr corrida) {
		this.run = corrida;
	}
	
	
	public int getVida() {
		return this.vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Estado getEstado() {
		return this.estado;
	}
	
	// Métodos de Alteração de Life/Vida
	public void sofrerAtaque(int dano) {
		int newVida = this.getVida() - dano;
		if (newVida >= 0)
			this.setVida(newVida);
		else
			this.setVida(0);
		
		this.estado.checaEstado();
	}
	
	public void recolherRecompensa(int vida) {
		int newVida = this.getVida() + vida;
		if (newVida <= 100)
			this.setVida(newVida);
		else
			this.setVida(100);
		
		this.estado.checaEstado();
	}
}
