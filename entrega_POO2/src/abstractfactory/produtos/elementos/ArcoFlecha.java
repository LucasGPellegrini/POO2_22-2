package abstractfactory.produtos.elementos;

public class ArcoFlecha extends Elemento {
    public ArcoFlecha(String nome) {
        super(nome, 2);
    }
    
    @Override
    public void serEncontrado() {
        System.out.println("Um incrível "+this.getNome() +" foi encontrado!");
    }
}
