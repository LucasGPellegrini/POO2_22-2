package singleton;

import strategy.Pular;

public class SgtnPulBai implements Pular{
    private static SgtnPulBai instancia = new SgtnPulBai();
    private SgtnPulBai () { super();}
    public static SgtnPulBai getInstancia() {
        return instancia;
    }

    @Override
    public void pular() {
        System.out.println("Pulo Baixo!");
    }
}
