package observer.model;

import java.util.Observable;
import java.util.Observer;

public class Inimigo implements Observer{
    private int x;
    private int y;
    private double buff; // Multiplicador de Velocidade
    
    public Inimigo(int x, int y){
        this.x = x;
        this.y = y;
        this.buff = 0.8;
    }
    
    public int getX() {return this.x;}
    public int getY() {return this.y;}    

    public void setX(int x){this.x = x;}           
    
    public void setY(int y){this.y = y;}    
    
    public void setBuff(double k) {this.buff = k;}
    
    @Override
    public void update(Observable subject, Object arg) {

        Jogador jogador = (Jogador)subject;
        
        //se estiver em distancia de atacar
        if ( 
                ( (this.x - jogador.getX()) <=  2) && 
                ( (this.x - jogador.getX()) >= -2) && 
                ( (this.y - jogador.getY()) <=  2) && 
                ( (this.y - jogador.getY()) >= -2) 
            ){
            System.out.println("Inimigo: "+this+" Ataca!" );
            // Ataca e recua
            jogador.getPersonagem().sofrerAtaque((int) (10*this.buff));
            double rand = Math.random();
            if (rand <= 0.25) {
                this.x -= (int) (70*this.buff);
                this.y -= (int) (70*this.buff);
            }
            else if (rand <= 0.5) {
                this.x -= (int) (70*this.buff);
                this.y += (int) (70*this.buff);
            }
            else if (rand <= 0.75) {
                this.x += (int) (70*this.buff);
                this.y -= (int) (70*this.buff);
            }
            else if (rand <= 1) {
                this.x += (int) (70*this.buff);
                this.y += (int) (70*this.buff);
            }
            
        }
        
        //se precisar andar em direcao ao jogador
        else {
           //se precisa andar para frente 
           if (jogador.getX() > this.x) this.x = this.x+(int)(5*this.buff);
           else this.x = this.x-(int)(5*this.buff);
           //se precisa andar para tras
           if (jogador.getY() > this.y) this.y = this.y+(int)(5*this.buff);
           else this.y = this.y-(int)(5*this.buff);
     
        }
        
    }
}
