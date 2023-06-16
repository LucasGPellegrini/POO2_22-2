package observer.controller;
import observer.model.Jogador;

public class MoverAlto implements Command{
    private Jogador j;
    
    public MoverAlto(Jogador j) {
        this.j = j;
    }
    
    @Override
    public void execute() {
        j.moverCima();
    }
    
}
