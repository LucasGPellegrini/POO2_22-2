package testes;

import cadeia.Escudo;
import cadeia.HandlerEscudo;
import contexto.Personagem;
import contexto.Personagem01;
import composite.*;

public class PrincipalComposite {
    public static void main(String[] args) {
        //PERSONAGEM
        Personagem p1 = new Personagem01();
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

        System.out.print("Estado do Personagem: ");
        System.out.println(p1.getEstado().getClass());
        System.out.print("Vida: ");
        System.out.println(p1.getVida()+"\n");
        
        
        Labirinto lab = new SalaPadrao(
                new SalaPadrao(
                        new SalaPadrao(new Abismo(), new Saida(), 30),
                        new Saida(), 20),
                new Saida(), 10);
        
        lab.passar_sala(p1, escudo5);
    }
}
