package singleton;

import strategy.Correr;

public class SgtnCorRap implements Correr{
    private static SgtnCorRap instancia = new SgtnCorRap();
    private SgtnCorRap () { super();}
    public static SgtnCorRap getInstancia() {
        return instancia;
    }

    @Override
    public void correr() {
        System.out.println("Corrida Rapida!");
    }
}