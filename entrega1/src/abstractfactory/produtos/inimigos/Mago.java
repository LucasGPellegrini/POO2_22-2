package abstractfactory.produtos.inimigos;

public class Mago extends Inimigo {
    public Mago(String nome) {
        super(nome, 10, 20);
    }
    
    @Override
    public void surgir() {
        System.out.println("O Poderoso MAGO "+this.getNome()+" Surgiu!");
    }
}
