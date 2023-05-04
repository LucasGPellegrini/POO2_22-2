package factorymethod;

import contexto.*;

public class JogoSimples {
    public static Personagem criaPersonagem(int tipo) {
        Personagem p;
        
        switch (tipo) {
            // Adiciona vida e verifica o estado dos personagens 
            // através do método recolherRecompensa()
            case 1 ->  {
                p = new Personagem01();
                p.recolherRecompensa(20);
            }
            case 2 ->  {
                    p = new Personagem02();
                    p.recolherRecompensa(15);
            }
            case 3 ->  {
                    p = new Personagem03();
                    p.recolherRecompensa(25);
            }
            default -> {
                    p = new Personagem01();
                    p.recolherRecompensa(30);
            }
        }
       
       return p;
    }
}
