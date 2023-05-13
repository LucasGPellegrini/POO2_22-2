package abstractfactory.produtos.inimigos;

// Classe simples para representar um Inimigo
public abstract class Inimigo {
    private String nome;
    private int dano_atk;
    private int vida;
    
    public Inimigo(String nome, int dano_atk, int vida) {
        this.setNome(nome);
        this.setDano_atk(dano_atk);
        this.setVida(vida);
    }
    
    abstract public void surgir();
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dano_atk
     */
    public int getDano_atk() {
        return dano_atk;
    }

    /**
     * @param dano_atk the dano_atk to set
     */
    public void setDano_atk(int dano_atk) {
        this.dano_atk = dano_atk;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }
    
}
