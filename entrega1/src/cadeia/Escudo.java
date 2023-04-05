package cadeia;

public class Escudo extends HandlerEscudo {

	public Escudo(int valor) {
		super(valor);
	}
	
	@Override
	public int processaAtaque(int dano) {
		int resto = dano - this.getValorEscudo();
		if (resto <= 0) {
			System.out.println("O ataque parou no escudo de valor " + this.getValorEscudo() + 
					" e não danificou a vida do personagem");
			return 0;
		}
		else {
			System.out.println("Escudo de valor " + this.getValorEscudo() + " quebrado!");
			if (getSucessor() != null)
				return getSucessor().processaAtaque(resto);
			else
				return resto;
		}

	}

}
