package singleton;

import strategy.Pular;

public class SgtnPulAlt implements Pular{
    private static SgtnPulAlt instancia = new SgtnPulAlt();
    private SgtnPulAlt () { super();}
    public static SgtnPulAlt getInstancia() {
        return instancia;
    }

    @Override
    public void pular() {
        System.out.println("Pulo Alto!");
    }
}