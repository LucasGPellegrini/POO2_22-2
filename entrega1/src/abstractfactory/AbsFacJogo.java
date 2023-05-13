package abstractfactory;

import abstractfactory.produtos.elementos.Elemento;
import abstractfactory.produtos.inimigos.Inimigo;
import contexto.Personagem;

public abstract class AbsFacJogo {
    public abstract Personagem criaPersonagemAbsFac(String tipo);
    public abstract Inimigo criaInimigoAbsFac(String tipo);
    public abstract Elemento criaElementoAbsFac(String tipo);
}
