package abstractfactory.produtos.elementos;

public abstract class Elemento {
    private String nome;
    private int adicional;
    
    public Elemento(String nome, int adicional) {
        this.nome = nome;
        this.adicional = adicional;
    }
    
    abstract public void serEncontrado();
    
    public String getNome() {
        return this.nome;
    }
    
    public int getAdicional() {
        return this.adicional;
    }
}
