package composite;

//Leaf

import cadeia.HandlerEscudo;
import contexto.Personagem;

public class Saida implements Labirinto{

    @Override
    public void passar_sala(Personagem p, HandlerEscudo escudo) {
        String pr = "-----------Parabens!-----------\n";
        String st = "o Personagem SAIU do Labirinto!\n";
        String vd = "com "+p.getVida()+" pontos de vida!\n";
        System.out.println(pr+st+vd);
    }
}
