package observer.model;

import contexto.Personagem;
import java.util.Observable;

public class Jogador extends Observable {
    private int x;
    private int y;
    private Personagem personagem;
    
    public Jogador(Personagem p, int x, int y) {
        this.personagem = p;
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public void moverEsq(){
        setX(getX()-10);
    }
    
    public void moverDir(){
        setX(getX()+10);
    }
    
    public void moverCima(){
        setY(getY()-10);
    }

    public void moverBaixo(){
        setY(getY()+10);
    }
    
    public void show(){
        setChanged();
        notifyObservers();
    }
    
    public Personagem getPersonagem(){
        return this.personagem;
    }
    
}
