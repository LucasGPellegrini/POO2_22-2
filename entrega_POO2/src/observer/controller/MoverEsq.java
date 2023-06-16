package observer.controller;
import observer.model.Jogador;

public class MoverEsq implements Command{
    private Jogador j;
    
    public MoverEsq(Jogador j) {
        this.j = j;
    }
    
    @Override
    public void execute() {
        j.moverEsq();
    }
    
}
