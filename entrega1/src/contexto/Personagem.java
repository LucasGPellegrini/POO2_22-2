package contexto;

import estado.Estado;
import estado.EstadoNormal;
import strategy.Atacar;
import strategy.Correr;
import strategy.Pular;

public abstract class Personagem {
	private Atacar atk;
	private Correr run;
	private Pular  jmp;
        private int vida;
	private Estado estado;
	
        public Personagem(){
            this.vida = 70;
            this.estado = new EstadoNormal(this);
        }
	
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
        
        public void setVida(int vida) {
		this.vida = vida;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	// Getters
	public Atacar getAtaque() {
		return this.atk;
	}
        
        public int getVida() {
		return this.vida;
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
