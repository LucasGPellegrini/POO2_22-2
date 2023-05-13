package abstractfactory.produtos.elementos;

public class RiflePlasma extends Elemento {
    public RiflePlasma(String nome) {
        super(nome, 2);
    }
    
    @Override
    public void serEncontrado() {
        System.out.println("Um exepcional "+this.getNome() +" foi encontrado!");
    }
}
