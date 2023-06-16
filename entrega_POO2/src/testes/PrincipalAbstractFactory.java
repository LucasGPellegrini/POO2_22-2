package testes;

import abstractfactory.*;

public class PrincipalAbstractFactory {
    public static void main(String[] args) {
        System.out.println("Jogo Medieval - Arqueiro");
        AbsFacJogo medieval1 = new FabricaMedieval();
        ClienteAbsFac jogoMedieval1 = new ClienteAbsFac(medieval1, "Arqueiro", 
                "Fraco", "Arco e Flecha");
        jogoMedieval1.executaJogo();
        
        System.out.println("\n\n\n Jogo Medieval - Guerreiro");
        AbsFacJogo medieval2 = new FabricaMedieval();
        ClienteAbsFac jogoMedieval2 = new ClienteAbsFac(medieval2, "Guerreiro", 
                "Forte", "Espada");
        jogoMedieval2.executaJogo();
        
        System.out.println("\n\n\n Jogo Moderno - Soldado");
        AbsFacJogo moderno1 = new FabricaModerna();
        ClienteAbsFac jogoModerno1 = new ClienteAbsFac(moderno1, "Soldado", 
                "Fraco", "Rifle de Plasma");
        jogoModerno1.executaJogo();
        
        System.out.println("\n\n\n Jogo Moderno - Jedi");
        AbsFacJogo moderno2 = new FabricaModerna();
        ClienteAbsFac jogoModerno2 = new ClienteAbsFac(moderno2, "Jedi", 
                "Forte", "Sabre de Luz");
        jogoModerno2.executaJogo();
    }
   
}
