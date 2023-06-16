package observer.controller;

public class Controle
{
    private Command[] c = new Command[10];
    
    public void setCommand(Command c, int i){
        this.c[i] = c;
    }
    
    public void pressionar(int i){
        this.c[i].execute();
    }
    
    public void executa(Command c){
        c.execute();
    }
}
