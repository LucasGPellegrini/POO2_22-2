package composite;

import java.util.Random;

public class SalaPadrao extends Sala{
    public SalaPadrao(Labirinto caminho1, Labirinto caminho2, int dano) {
        super(caminho1, caminho2, dano);
    }
    
    @Override
    public int passar_sala() {
        Random rd = new Random();
        boolean caminho = rd.nextBoolean();
        
        System.out.println("Tomou: "+this.getDano()+" pontos de dano");
        if (caminho) {
            return this.getDano() + getC1().passar_sala();
        }
        else {
            return this.getDano() + getC2().passar_sala();
        }
    }
    
}
