package observer.controller;
import observer.model.Jogador;

public class MoverBaixo implements Command{
    private Jogador j;
    
    public MoverBaixo(Jogador j) {
        this.j = j;
    }
    
    @Override
    public void execute() {
        j.moverBaixo();
    }
    
}
