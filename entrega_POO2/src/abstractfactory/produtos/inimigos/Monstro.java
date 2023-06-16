package abstractfactory.produtos.inimigos;

public class Monstro extends Inimigo {
    public Monstro(String nome) {
        super(nome, 5, 10);
    }
    
    @Override
    public void surgir() {
        System.out.println("O Monstro "+this.getNome()+" Surgiu!");
    }
}