package composite;

import cadeia.HandlerEscudo;
import contexto.Personagem;

//Leaf
public class Abismo implements Labirinto{

    @Override
    public void passar_sala(Personagem p, HandlerEscudo escudo) {
        String pr = "--------FIM DE JOGO!--------\n";
        String st = "o Personagem CAIU no ABISMO!\n";
        System.out.println(pr+st);
        // Sofre um dano que mata o personagem -> Abismo indica fim de jogo!
        p.sofrerAtaque(p.getVida());
    }
}
