package cadeia;

public abstract class HandlerEscudo {
	private HandlerEscudo sucessor;
	private int valorEscudo;
	
	public HandlerEscudo(int valor) {
		this.valorEscudo = valor;
	}
	
	public void setSucessor(HandlerEscudo sucessor) {
		this.sucessor = sucessor;
	}
	
	public int getValorEscudo() {
		return this.valorEscudo;
	}
	
	public HandlerEscudo getSucessor(){
		return this.sucessor;
	}
	
	public abstract int processaAtaque(int dano);
}
