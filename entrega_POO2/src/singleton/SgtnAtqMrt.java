package singleton;

import strategy.Atacar;

public class SgtnAtqMrt implements Atacar{
    private static SgtnAtqMrt instancia = new SgtnAtqMrt();
    private SgtnAtqMrt () { super();}
    public static SgtnAtqMrt getInstancia() {
        return instancia;
    }

    @Override
    public int atacar() {
	System.out.println("Fim de Jogo!");
	return 0;
    }
}
