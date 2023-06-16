package abstractfactory.produtos.inimigos;

public class Droid extends Inimigo {
    public Droid(String nome) {
        super(nome, 5, 10);
    }
    
    @Override
    public void surgir() {
        System.out.println("O Droid "+this.getNome()+" Surgiu!");
    }
}
