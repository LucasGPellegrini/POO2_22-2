package singleton.personagens;

import contexto.Personagem;
import singleton.*;

public class SgtnPers03 extends Personagem {
    public SgtnPers03() {
        super();
        setAtaque(SgtnAtqFor.getInstancia());
        setCorrida(SgtnCorRap.getInstancia());
        setPulo(SgtnPulBai.getInstancia());
    }
}
