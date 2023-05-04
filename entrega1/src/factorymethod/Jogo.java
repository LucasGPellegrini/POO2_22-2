package factorymethod;

import contexto.Personagem;

public abstract class Jogo {
    public abstract Personagem criaPersonagem(int tipo);
    
    final void jogar() {
        // logica do game
        //...
    }
}
