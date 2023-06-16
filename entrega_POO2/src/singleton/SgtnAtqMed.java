package singleton;

import strategy.Atacar;

public class SgtnAtqMed implements Atacar{
    private static SgtnAtqMed instancia = new SgtnAtqMed();
    private SgtnAtqMed () { super();}
    public static SgtnAtqMed getInstancia() {
        return instancia;
    }

    @Override
    public int atacar() {
	System.out.println("Ataque Medio!");
	return 15;
    }
}
