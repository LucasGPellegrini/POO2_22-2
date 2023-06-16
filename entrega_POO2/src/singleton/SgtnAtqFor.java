package singleton;

import strategy.Atacar;

public class SgtnAtqFor implements Atacar{
    private static SgtnAtqFor instancia = new SgtnAtqFor();
    private SgtnAtqFor () { super();}
    public static SgtnAtqFor getInstancia() {
        return instancia;
    }

    @Override
    public int atacar() {
	System.out.println("Ataque Forte!");
	return 30;
    }
}
