package singleton;

import strategy.Atacar;

public class SgtnAtqFra implements Atacar{
    private static SgtnAtqFra instancia = new SgtnAtqFra();
    private SgtnAtqFra () { super();}
    public static SgtnAtqFra getInstancia() {
        return instancia;
    }

    @Override
    public int atacar() {
	System.out.println("Ataque Fraco!");
	return 10;
    }
}
