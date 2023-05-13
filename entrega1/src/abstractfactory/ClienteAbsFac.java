package abstractfactory;

import abstractfactory.produtos.elementos.Elemento;
import abstractfactory.produtos.inimigos.Inimigo;
import contexto.Personagem;

public class ClienteAbsFac {
    private Inimigo inimigo;
    private Personagem personagem;
    private Elemento arma;
    
    public ClienteAbsFac(AbsFacJogo fabrica, String tipoPersonagem, 
            String tipoInimigo, String tipoArma) {
        inimigo = fabrica.criaInimigoAbsFac(tipoInimigo);
        personagem = fabrica.criaPersonagemAbsFac(tipoPersonagem);
        arma = fabrica.criaElementoAbsFac(tipoArma);
    }
    
    public void executaJogo() {
        System.out.println("O personagem vaga pelas sordidas terras!");
        System.out.print("Personagem: ");
        System.out.println(personagem.getClass());
        System.out.print("Vida: ");
        System.out.println(personagem.getVida());
        arma.serEncontrado();
        inimigo.surgir();
    }
}
