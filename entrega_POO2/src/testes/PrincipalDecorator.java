package testes;

import contexto.*;
import decorator.*;

public class PrincipalDecorator {

	public static void main(String[] args) {
		Personagem p1 = new Personagem01();
		
		// CLIENTE
		System.out.println("-=-=-=-=-=-=-=-=-=\n");
		int dano = p1.atacar();
		System.out.println("Dano do ataque: "+dano);
		
		// Adicionar Fogo no Ataque
		System.out.println("-=-=-=-=-=-=-=-=-=\n");
		p1.setAtaque(new Fogo(p1.getAtaque()));
		System.out.println("Poder de Fogo Ativado!");
		dano = p1.atacar();
		System.out.println("Dano do ataque: "+dano);

		// Adicionar Ar no Ataque
		System.out.println("-=-=-=-=-=-=-=-=-=\n");
		p1.setAtaque(new Ar(p1.getAtaque()));
		System.out.println("Poder de Ar Ativado!");
		dano = p1.atacar();
		System.out.println("Dano do ataque: "+dano);
		
		// Adicionar Agua no Ataque
		System.out.println("-=-=-=-=-=-=-=-=-=\n");
		p1.setAtaque(new Agua(p1.getAtaque()));
		System.out.println("Poder de Agua Ativado!");
		dano = p1.atacar();
		System.out.println("Dano do ataque: "+dano);
	}

}
