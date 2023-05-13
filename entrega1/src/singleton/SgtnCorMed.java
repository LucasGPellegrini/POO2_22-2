package singleton;

import strategy.Correr;

public class SgtnCorMed implements Correr{
    private static SgtnCorMed instancia = new SgtnCorMed();
    private SgtnCorMed () { super();}
    public static SgtnCorMed getInstancia() {
        return instancia;
    }

    @Override
    public void correr() {
        System.out.println("Corrida Media!");
    }
}