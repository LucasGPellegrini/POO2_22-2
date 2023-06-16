package singleton;

import strategy.Correr;

public class SgtnCorDev implements Correr{
    private static SgtnCorDev instancia = new SgtnCorDev();
    private SgtnCorDev () { super();}
    public static SgtnCorDev getInstancia() {
        return instancia;
    }

    @Override
    public void correr() {
        System.out.println("Corrida Devagar!");
    }
}
