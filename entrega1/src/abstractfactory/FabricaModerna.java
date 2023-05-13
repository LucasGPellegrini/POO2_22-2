package abstractfactory;

import abstractfactory.produtos.inimigos.*;
import abstractfactory.produtos.personagens.*;
import abstractfactory.produtos.elementos.*;
import contexto.Personagem;


public class FabricaModerna extends AbsFacJogo{

    @Override
    public Personagem criaPersonagemAbsFac(String tipo) {
        if(tipo.equals("Soldado")) {
            return new Soldado();
        }
        else {
            return new Jedi();
        }
    }

    @Override
    public Inimigo criaInimigoAbsFac(String tipo) {
        if(tipo.equals("Fraco")) {
            return new Droid("Droid");
        }
        else {/* if (tipo.equals("Forte")) */
            return new Stormtrooper("Commander");
        }
    }

    @Override
    public Elemento criaElementoAbsFac(String tipo) {
        if(tipo.equals("Rifle de Plasma")) {
            return new RiflePlasma("Rifle de Plasma");
        }
        else {
            return new SabreLuz("Sabre Lendario");
        }
    }
    
}
