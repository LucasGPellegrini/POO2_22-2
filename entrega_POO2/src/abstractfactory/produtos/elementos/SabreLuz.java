package abstractfactory.produtos.elementos;

public class SabreLuz extends Elemento {
    public SabreLuz(String nome) {
        super(nome, 3);
    }
    
    @Override
    public void serEncontrado() {
        System.out.println("Um sublime "+this.getNome() +" foi encontrado!");
    }
}
