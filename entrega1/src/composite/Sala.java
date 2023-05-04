package composite;

//Composite
public abstract class Sala implements Labirinto {
    private Labirinto caminho1;
    private Labirinto caminho2;
    private int dano_do_inimigo;
    
    public Sala(Labirinto caminho1, Labirinto caminho2, int dano) {
        this.caminho1 = caminho1;
        this.caminho2 = caminho2;
        this.dano_do_inimigo = dano;
    }
    
    public Labirinto getC1() {
        return this.caminho1;
    }
    
    public Labirinto getC2() {
        return this.caminho2;
    }
    
    public int getDano() {
        return this.dano_do_inimigo;
    }
}
