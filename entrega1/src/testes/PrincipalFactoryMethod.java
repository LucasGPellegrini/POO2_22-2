package testes;

import factorymethod.*;

public class PrincipalFactoryMethod {
    public static void main(String[] args) {
            Jogo jogoFM = new JogoComPoder();
            jogoFM.jogar();
            
            System.out.println("\n\n---------------------------------\n");
            
            JogoSimples jogoSF = new JogoSimples();
            //jogoSF.jogar();
	}
}
