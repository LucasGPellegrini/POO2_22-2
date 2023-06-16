package observer.model;

import java.util.Observable;
import java.util.Observer;

public class Checkpoint implements Observer{
    private int x;
    private int y;
    private boolean is_ativo;
    private boolean foi_pego;
    
    public Checkpoint(int x, int y, boolean ativo){
        this.x = x;
        this.y = y;
        this.is_ativo = ativo;
        this.foi_pego = false;
    }
    
    public int getX() {return this.x;}
    public int getY() {return this.y;}    
    public void setX(int x){this.x = x;}           
    public void setY(int y){this.y = y;}
    public boolean getAtivo() {return this.is_ativo;}    
    public void setAtivo(boolean x){this.is_ativo = x;}
    public boolean getPego() {return this.foi_pego;} 
        
    @Override
    public void update(Observable subject, Object arg) {

        Jogador jogador = (Jogador)subject;
        
        // Se estiver proximo o suficiente
        if ( 
                ( (this.x - jogador.getX()) <=  20) && 
                ( (this.x - jogador.getX()) >= -20) && 
                ( (this.y - jogador.getY()) <=  20) && 
                ( (this.y - jogador.getY()) >= -20) &&
                  (this.is_ativo          )
            ){
            System.out.println("Checkpoint: "+this+" Atingido!" );
            // Da 10 de vida pro personagem!
            jogador.getPersonagem().recolherRecompensa(10);
            this.is_ativo = false;
            this.foi_pego = true;
        }        
    }
}
