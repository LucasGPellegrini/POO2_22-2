package singleton;

import strategy.Pular;

public class SgtnPulMed implements Pular{
    private static SgtnPulMed instancia = new SgtnPulMed();
    private SgtnPulMed () { super();}
    public static SgtnPulMed getInstancia() {
        return instancia;
    }

    @Override
    public void pular() {
        System.out.println("Pulo Medio!");
    }
}
