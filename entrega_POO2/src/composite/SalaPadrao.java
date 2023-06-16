package composite;

import cadeia.HandlerEscudo;
import contexto.*;
import estado.EstadoMorto;
import java.util.Random;

public class SalaPadrao extends Sala{
    public SalaPadrao(Labirinto caminho1, Labirinto caminho2, int dano) {
        super(caminho1, caminho2, dano);
    }
    
    @Override
    public void passar_sala(Personagem p, HandlerEscudo escudo) {
        Random rd = new Random();
        
        System.out.println("Tomou: "+this.getDano()+" pontos de dano");
        p.sofrerAtaque(escudo.processaAtaque(this.getDano()));
        System.out.print("\nEstado do Personagem: ");
        System.out.println(p.getEstado().getClass());
        System.out.print("Vida: ");
        System.out.println(p.getVida());
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        
        // Se o personagem morre no meio do labirinto: Fim de jogo!
        if (p.getEstado().getClass() == (new EstadoMorto(new Personagem01())).getClass()) {
            return;
        }
        
        boolean caminho = rd.nextBoolean();
        if (caminho)
            getC1().passar_sala(p, escudo);
        else
            getC2().passar_sala(p, escudo);
        
    }
    
}
