package testecadeia;

import cadeia.*;
import contexto.Personagem_2e3;

public class Principal {
	
	public static void main(String[] args) {
		Personagem_2e3 p1 = new Personagem_2e3();
		
		// Inicio da Cadeia
		HandlerEscudo escudo5 = new Escudo(5);
		HandlerEscudo escudo2 = new Escudo(2);
		HandlerEscudo escudo1 = new Escudo(1);
		HandlerEscudo escudo3 = new Escudo(3);
		// Fim da Cadeia
		
		// Encadear Objetos da cadeia
		escudo5.setSucessor(escudo2);
		escudo2.setSucessor(escudo1);
		escudo1.setSucessor(escudo3);
		escudo3.setSucessor(null);
		
		System.out.println("Personagem Criado!");
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");	
		System.out.println("Recebe ataque de 70 PV");
		p1.sofrerAtaque(escudo5.processaAtaque(70));
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
		
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
		System.out.println("Escudos Recarregados!");
		System.out.println("Recebe ataque de 9 PV");
		p1.sofrerAtaque(escudo5.processaAtaque(9));
		System.out.println("Estado do Personagem:");
		System.out.println(p1.getEstado().getClass());
		System.out.print("Vida: ");
		System.out.println(p1.getVida());
		p1.atacar();
		p1.correr();
	}
}
