package testes;

import factorymethod.*;

public class PrincipalFactoryMethod {
    public static void main(String[] args) {
            Jogo jogoFM = new JogoComPoder();
            jogoFM.jogar();
            
            System.out.println("\n\n-------------JOGO-SIMPLE_FACTORY-------------\n\n");
            
            Jogo jogoSF = new JogoSimples();
            jogoSF.jogar();
	}
}
