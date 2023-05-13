package testes;

import contexto.Personagem;
import singleton.personagens.*;

public class PrincipalSingleton {
    public static void main(String[] args) {
		Personagem p1 = new SgtnPers01();
		Personagem p2 = new SgtnPers02();
		Personagem p3 = new SgtnPers03();
		
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Personagem 01:");
		p1.atacar();
		p1.pular();
		p1.correr();
		
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Personagem 02:");
		p2.atacar();
		p2.pular();
		p2.correr();
		
		System.out.println("\n-_-_-_-_-_-_-_-_-_-_-_");
		System.out.println("Personagem 03:");
		p3.atacar();
		p3.pular();
		p3.correr();
		
	}
}
