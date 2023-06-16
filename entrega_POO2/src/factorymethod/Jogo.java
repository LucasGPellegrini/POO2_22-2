package factorymethod;

import contexto.Personagem;

public abstract class Jogo {
    public abstract Personagem criaPersonagem(int tipo);
    
    public final void jogar() {
        // cria dois personagens que se atacam até a morte de um
        Personagem p1 = criaPersonagem(2);
        Personagem p2 = criaPersonagem(1);
        int dano;
        
        while(p1.getVida() > 0 && p2.getVida() > 0){
            if(p1.getVida() > 0) {
                dano = p1.atacar();
                p2.sofrerAtaque(dano);
                System.out.println("P1 ataca P2 com dano: "+dano);
                System.out.print(estado_toString(p1, p2));
            }
            
            if(p2.getVida() > 0) {
                dano = p2.atacar();
                p1.sofrerAtaque(dano);
                System.out.println("P2 ataca P1 com dano: "+dano);
                System.out.print(estado_toString(p1, p2));
            }
        }
        
        int vidaP1 = p1.getVida();
        int vidaP2 = p2.getVida();
        System.out.println("-=-=-=-=-Fim de Jogo-=-=-=-=-");
        if (vidaP1 > 0)
            System.out.println("O Personagem P1 ganhou com "
                    +vidaP1+
                    " pontos de vida!");
        
        else if (vidaP2 > 0)
            System.out.println("O Personagem P1 ganhou com "
                    +vidaP2+
                    " pontos de vida!");
        else
            System.out.println("EMPATE! Ambos os personagens MORRERAM!");
    }
    
    private String estado_toString(Personagem p1, Personagem p2) {
        String s = "";
        s += "-> P1:\n";
        s += "Vida: "+p1.getVida()+"\n";
        s += "--------\n";
        s += "-> P2:\n";
        s += "Vida: "+p2.getVida()+"\n";
        s += "========\n\n";
        
        return s;
    }
}
