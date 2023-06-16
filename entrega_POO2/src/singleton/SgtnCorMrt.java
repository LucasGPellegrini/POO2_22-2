package singleton;

import strategy.Correr;

public class SgtnCorMrt implements Correr{
    private static SgtnCorMrt instancia = new SgtnCorMrt();
    private SgtnCorMrt () { super();}
    public static SgtnCorMrt getInstancia() {
        return instancia;
    }

    @Override
    public void correr() {
        System.out.println("Fim de Jogo!");
    }
}
