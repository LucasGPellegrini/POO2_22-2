package singleton.personagens;

import contexto.Personagem;
import singleton.*;

public class SgtnPers01 extends Personagem {
    public SgtnPers01() {
        super();
        setAtaque(SgtnAtqFor.getInstancia());
        setCorrida(SgtnCorMed.getInstancia());
        setPulo(SgtnPulMed.getInstancia());
    }
}
