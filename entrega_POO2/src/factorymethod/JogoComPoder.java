package factorymethod;

import contexto.*;
import decorator.*;

public class JogoComPoder extends Jogo {

    @Override
    public Personagem criaPersonagem(int tipo) {
        Personagem p;
        
        switch (tipo) {
            // Adiciona vida e verifica o estado dos personagens 
            // através do método recolherRecompensa()
            // Personagens são decorados!
            case 1 ->  {
                p = new Personagem01();
                p.recolherRecompensa(20);
                p.setAtaque(new Fogo(new Ar(p.getAtaque())));
            }
            case 2 ->  {
                p = new Personagem02();
                p.recolherRecompensa(15);
                p.setAtaque(new Ar(p.getAtaque()));
            }
            case 3 ->  {
                p = new Personagem03();
                p.recolherRecompensa(25);
                p.setAtaque(new Ar(new Agua(p.getAtaque())));
            }
            default -> {
                p = new Personagem01();
                p.recolherRecompensa(30);
                p.setAtaque(new Fogo(p.getAtaque()));
            }
        }
       
       return p;
    }
    
}
