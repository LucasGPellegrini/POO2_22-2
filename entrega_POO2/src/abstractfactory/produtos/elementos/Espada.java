package abstractfactory.produtos.elementos;

public class Espada extends Elemento {
    public Espada(String nome) {
        super(nome, 3);
    }
    
    @Override
    public void serEncontrado() {
        System.out.println("Uma incrível "+this.getNome() +" foi encontrada!");
    }
    
}
