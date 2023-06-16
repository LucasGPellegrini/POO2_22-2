package templatemethod;

import cadeia.HandlerEscudo;
import composite.Labirinto;
import composite.Sala;
import contexto.Personagem;
import contexto.Personagem01;
import estado.EstadoMorto;


public abstract class TemplateLabirinto extends Sala{
    public TemplateLabirinto(Labirinto caminho1, Labirinto caminho2, int dano) {
        super(caminho1, caminho2, dano);
    }
    
    @Override
    public final void passar_sala(Personagem p, HandlerEscudo escudo) { 
        int dano_recebido = this.lutar();
        System.out.println("Tomou: "+dano_recebido+" pontos de dano");
        p.sofrerAtaque(escudo.processaAtaque(dano_recebido));
        System.out.print("\nEstado do Personagem: ");
        System.out.println(p.getEstado().getClass());
        System.out.print("Vida: ");
        System.out.println(p.getVida());
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
        
        // Se o personagem morre no meio do labirinto: Fim de jogo!
        if (p.getEstado().getClass() == (new EstadoMorto(new Personagem01())).getClass()) {
            return;
        }
        
        selecionarCaminho().passar_sala(p, escudo);
    }
    
    public abstract Labirinto selecionarCaminho();
    public abstract int lutar();
}
