package templatemethod;

import composite.Labirinto;
import java.util.Random;

public class SalaRandomica extends TemplateLabirinto{
    public SalaRandomica(Labirinto caminho1, Labirinto caminho2, int dano) {
        super(caminho1, caminho2, dano);
    }

    @Override
    public Labirinto selecionarCaminho() {
        Random rd = new Random();
        boolean caminho = rd.nextBoolean();
        if (caminho)
            return getC1();
        else
            return getC2();
    }

    @Override
    public int lutar() {
        Random random = new Random();
        int dano = random.nextInt(10 - 0);
        return dano;
    }
    
}
