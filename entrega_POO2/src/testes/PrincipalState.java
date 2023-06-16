package testes;

import contexto.*;

public class PrincipalState {
	
	public static void main(String[] args) {
		Personagem p1 = new Personagem01();
		
		System.out.println("Personagem Criado!");
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		System.out.println("Sofreu ataque de 45 Pontos de Vida");
		p1.sofrerAtaque(45);
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		System.out.println("Recolheu recompensa de 70 Pontos de Vida");
		p1.recolherRecompensa(70);
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		System.out.println("Sofreu ataque de 99 Pontos de Vida");
		p1.sofrerAtaque(99);
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
	}
}
