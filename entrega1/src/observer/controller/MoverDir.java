package observer.controller;
import observer.model.Jogador;

public class MoverDir implements Command{
    private Jogador j;
    
    public MoverDir(Jogador j) {
        this.j = j;
    }
    
    @Override
    public void execute() {
        j.moverDir();
    }
    
}
