package abstractfactory.produtos.inimigos;

public class Stormtrooper extends Inimigo {
    public Stormtrooper(String nome) {
        super(nome, 10, 20);
    }
    
    @Override
    public void surgir() {
        System.out.println("O Poderoso STORMTROOPER "+this.getNome()+" Surgiu!");
    }
    
}
