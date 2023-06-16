package singleton.personagens;

import contexto.Personagem;
import singleton.*;

public class SgtnPers02 extends Personagem {
    public SgtnPers02() {
        super();
        setAtaque(SgtnAtqMed.getInstancia());
        setCorrida(SgtnCorRap.getInstancia());
        setPulo(SgtnPulAlt.getInstancia());
    }
}
