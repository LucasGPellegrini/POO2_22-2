package abstractfactory;

import abstractfactory.produtos.inimigos.*;
import abstractfactory.produtos.personagens.*;
import abstractfactory.produtos.elementos.*;

import contexto.*;

public class FabricaMedieval extends AbsFacJogo{

    @Override
    public Personagem criaPersonagemAbsFac(String tipo) {
        if(tipo.equals("Arqueiro")) {
            return new Arqueiro();
        }
        else { /*if (tipo.equals("Guerreiro"))*/
            return new Guerreiro();
        }
    }

    @Override
    public Inimigo criaInimigoAbsFac(String tipo) {
        if(tipo.equals("Fraco")) {
            return new Monstro("Goblin");
        }
        else { /*if (tipo.equals("Forte"))*/
            return new Mago("Pyro");
        }
    }

    @Override
    public Elemento criaElementoAbsFac(String tipo) {
        if(tipo.equals("Arco e Flecha")) {
            return new ArcoFlecha("Arco Recurvo");
        }
        else {
            return new Espada("Espada Longa");
        }
    }
    
}
