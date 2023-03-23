package testset;
import context.*;

public class Main {

	public static void main(String[] args) {
		Personagem01 p1 = new Personagem01();
		Personagem02 p2 = new Personagem02();
		Personagem03 p3 = new Personagem03();
		
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
