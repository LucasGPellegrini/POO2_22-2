package templatemethod;

import composite.Labirinto;
import java.util.Random;
import java.util.Scanner;

public class SalaInterativa extends TemplateLabirinto {
    public SalaInterativa(Labirinto caminho1, Labirinto caminho2, int dano) {
        super(caminho1, caminho2, dano);
    }
    
    @Override
    public Labirinto selecionarCaminho() {
        Scanner in = new Scanner(System.in);
        int caminho = 0;
        
        while(caminho < 1 || caminho > 2){
            System.out.print("\nEscolha um caminho (1 ou 2): ");
            caminho = in.nextInt();
        }
        
        return (caminho == 1) ? getC1() : getC2();
    }

    @Override
    public int lutar() {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        
        int dano = random.nextInt(10 - 1) + 1;
        int escolha = 0;
        while(escolha <= 0 || escolha > 10){
            System.out.print("\nTente a sorte! [1 a 10]: ");
            escolha = in.nextInt();
        }
        
        // Verifica se o usuário acertou o dano sorteado
        // retorna 0 caso sim, retorna "dano" caso não.
        return (escolha == dano) ? 0 : dano;
    }
    
}
